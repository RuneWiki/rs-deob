import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class406 {
   @OriginalMember(
      owner = "client!tm",
      name = "g",
      descriptor = "I"
   )
   public int field6325;
   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6333 = new String[]{method3264(method3263("\u000eV*}=")), method3264(method3263("\u0001\u0015*\u0011h")), method3264(method3263("\u0014NhS")), method3264(method3263("\u000eV*\u0003|\u0014Rp\u0001=")), method3264(method3263("\u000eV*~=")), method3264(method3263("\u000eV*|=")), method3264(method3263("\u000eV*Kz)OvV{\u001d\u0013"))};
   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field6327 = Calendar.getInstance();
   @OriginalMember(
      owner = "client!tm",
      name = "j",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field6326 = Calendar.getInstance(TimeZone.getTimeZone(method3264(method3263("=vP"))));
   @OriginalMember(
      owner = "client!tm",
      name = "d",
      descriptor = "Luk;"
   )
   public static class498 field6329 = new class498(20, 4);
   @OriginalMember(
      owner = "client!tm",
      name = "c",
      descriptor = "S"
   )
   public static short field6332 = 1;
   @OriginalMember(
      owner = "client!tm",
      name = "f",
      descriptor = "I"
   )
   public static int field6323;
   @OriginalMember(
      owner = "client!tm",
      name = "h",
      descriptor = "I"
   )
   public static int field6324;
   @OriginalMember(
      owner = "client!tm",
      name = "b",
      descriptor = "I"
   )
   public static int field6328;
   @OriginalMember(
      owner = "client!tm",
      name = "i",
      descriptor = "I"
   )
   public static int field6331;
   @OriginalMember(
      owner = "client!tm",
      name = "e",
      descriptor = "Lffa;"
   )
   public static class657 field6330;

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method3260(byte arg0) {
      try {
         field6329 = null;
         field6330 = null;
         if (arg0 != -81) {
            method3260((byte)-5);
         }

         field6327 = null;
         field6326 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6333[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 19
   )
   public final String toString() {
      try {
         ++field6323;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6333[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(IZ)I",
      line = 29
   )
   public static final int method3261(int arg0, boolean arg1) {
      try {
         ++field6328;
         if (!arg1) {
            method3260((byte)81);
         }

         return arg0 >>> 8;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6333[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V",
      line = 42
   )
   public class406(String arg0, int arg1) {
      try {
         this.field6325 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6333[3] + (arg0 != null ? field6333[1] : field6333[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(Z)I",
      line = 53
   )
   public final int method3262(boolean arg0) {
      try {
         ++field6324;
         return !arg0 ? 96 : this.field6325;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6333[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3263(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3264(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
