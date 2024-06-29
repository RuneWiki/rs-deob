import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class27 extends class191 {
   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field405 = new String[]{method348(method347("[H\u001d\b'")), method348(method347("G\t\u001ddr")), method348(method347("RR_&")), method348(method347("[H\u001d\f'")), method348(method347("[H\u001d\u000e'")), method348(method347("[H\u001d\u000f'")), method348(method347("[H\u001d\r'")), method348(method347("[H\u001d\t'"))};
   @OriginalMember(
      owner = "client!go",
      name = "r",
      descriptor = "Lfm;"
   )
   public static class164 field399 = new class164(36, 11);
   @OriginalMember(
      owner = "client!go",
      name = "s",
      descriptor = "I"
   )
   public static int field397;
   @OriginalMember(
      owner = "client!go",
      name = "n",
      descriptor = "I"
   )
   public static int field398;
   @OriginalMember(
      owner = "client!go",
      name = "m",
      descriptor = "I"
   )
   public static int field400;
   @OriginalMember(
      owner = "client!go",
      name = "l",
      descriptor = "I"
   )
   public static int field402;
   @OriginalMember(
      owner = "client!go",
      name = "q",
      descriptor = "I"
   )
   public static int field403;
   @OriginalMember(
      owner = "client!go",
      name = "o",
      descriptor = "I"
   )
   public static int field404;
   @OriginalMember(
      owner = "client!go",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   private String field401;

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method341(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         ++field400;
         if (arg0 > -106) {
            field399 = null;
         }

         arg1.field6627 = this.field401;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field405[0] + arg0 + ',' + (arg1 != null ? field405[1] : field405[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method343(byte arg0) {
      try {
         field399 = null;
         int var1 = -23 % ((49 - arg0) / 42);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field405[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "b",
      descriptor = "(I)[Lbu;"
   )
   public static final class234[] method344(int arg0) {
      try {
         ++field404;
         if (arg0 != -30306) {
            method341(29);
         }

         return new class234[]{class539.field7570, class34.field494, class685.field9888, class524.field7410, class619.field8872, class356.field5269, class359.field5305, class507.field7203, class73.field1173, class596.field8393, class72.field1163, class483.field6921, class203.field2902, class269.field4126};
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field405[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method345(int arg0, int arg1, int arg2) {
      try {
         ++field397;
         if (arg2 <= 25) {
            field399 = null;
         }

         int var3 = class617.method4536(arg0 - 1, 3, arg1 + -1) - -class617.method4536(arg0 + -1, 3, arg1 - -1) + (class617.method4536(arg0 - -1, 3, arg1 - 1) - -class617.method4536(arg0 + 1, 3, arg1 - -1));
         int var4 = class617.method4536(arg0, 3, arg1 + -1) - -class617.method4536(arg0, 3, arg1 + 1) - (-class617.method4536(arg0 + -1, 3, arg1) - class617.method4536(arg0 + 1, 3, arg1));
         int var5 = class617.method4536(arg0, 3, arg1);
         return var5 / 4 + var3 / 16 + var4 / 8;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field405[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         ++field403;
         this.field401 = arg0.method640((byte)51);
         if (arg1 > -97) {
            this.field401 = null;
         }

         arg0.method701(255);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field405[7] + (arg0 != null ? field405[1] : field405[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method347(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method348(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
