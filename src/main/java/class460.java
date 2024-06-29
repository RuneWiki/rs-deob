import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class460 {
   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6741 = new String[]{method3458(method3457("(\u000f\u0015I}")), method3458(method3457("-\tWd")), method3458(method3457("(\u000f\u0015K}")), method3458(method3457("8R\u0015&(")), method3458(method3457("(\u000f\u0015J}"))};
   @OriginalMember(
      owner = "client!ks",
      name = "f",
      descriptor = "Lkea;"
   )
   public static class248 field6736 = new class248("", 18);
   @OriginalMember(
      owner = "client!ks",
      name = "b",
      descriptor = "I"
   )
   public static int field6738 = 1;
   @OriginalMember(
      owner = "client!ks",
      name = "d",
      descriptor = "Lgh;"
   )
   public static class572 field6739 = new class572(26, 1);
   @OriginalMember(
      owner = "client!ks",
      name = "c",
      descriptor = "F"
   )
   public static float field6740;
   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "I"
   )
   public static int field6735;
   @OriginalMember(
      owner = "client!ks",
      name = "e",
      descriptor = "I"
   )
   public static int field6737;

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3454(int arg0) {
      try {
         if (arg0 <= 80) {
            method3455((Canvas)null, (byte)-75);
         }

         field6739 = null;
         field6736 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6741[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;B)V"
   )
   public static final void method3455(Canvas arg0, byte arg1) {
      try {
         ++field6735;
         if (arg1 < 44) {
            method3456((long[])null, (byte)-123, (int[])null);
         }

         Dimension var2 = arg0.getSize();
         class213.method1813(var2.width, var2.height, 32493);
         if (class402.field5939 == 1) {
            class393.field5787.method310(arg0, class220.field3311, class31.field473);
         } else {
            class393.field5787.method310(arg0, class82.field1382, class634.field9251);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6741[4] + (arg0 != null ? field6741[3] : field6741[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "([JB[I)V"
   )
   public static final void method3456(long[] arg0, byte arg1, int[] arg2) {
      try {
         if (arg1 == 124) {
            class670.method4900(arg2, 0, (byte)-91, arg0.length + -1, arg0);
            ++field6737;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6741[2] + (arg0 != null ? field6741[3] : field6741[1]) + ',' + arg1 + ',' + (arg2 != null ? field6741[3] : field6741[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3457(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3458(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
