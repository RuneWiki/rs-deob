import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class655 {
   @OriginalMember(
      owner = "client!oh",
      name = "e",
      descriptor = "Lww;"
   )
   private class339 field9780;
   @OriginalMember(
      owner = "client!oh",
      name = "c",
      descriptor = "Lww;"
   )
   private class339 field9779;
   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9785 = new String[]{method4811(method4810("K{p\r")), method4811(method4810("^ 2O'")), method4811(method4810("Jf2 r")), method4811(method4810("Jf2]3Kgh_r")), method4811(method4810("Jf2#r")), method4811(method4810("Jf2\"r"))};
   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "I"
   )
   public static int field9781;
   @OriginalMember(
      owner = "client!oh",
      name = "f",
      descriptor = "I"
   )
   public static int field9782;
   @OriginalMember(
      owner = "client!oh",
      name = "d",
      descriptor = "I"
   )
   public static int field9784;
   @OriginalMember(
      owner = "client!oh",
      name = "b",
      descriptor = "Liia;"
   )
   private class539 field9783;

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(ILd;BLjava/awt/Canvas;ILww;)Lha;"
   )
   public static final class479 method4807(int arg0, class102 arg1, byte arg2, Canvas arg3, int arg4, class339 arg5) {
      try {
         ++field9781;
         int var6 = 0;
         int var7 = 0;
         if (arg2 > -31) {
            method4807(-101, (class102)null, (byte)-56, (Canvas)null, -117, (class339)null);
         }

         if (arg3 != null) {
            Dimension var8 = arg3.getSize();
            var6 = var8.width;
            var7 = var8.height;
         }

         return class479.method3647(arg1, arg3, -3, var6, arg0, arg4, arg5, var7);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field9785[2] + arg0 + ',' + (arg1 != null ? field9785[1] : field9785[0]) + ',' + arg2 + ',' + (arg3 != null ? field9785[1] : field9785[0]) + ',' + arg4 + ',' + (arg5 != null ? field9785[1] : field9785[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(Lcea;I)Lwba;"
   )
   public final class603 method4808(class110 arg0, int arg1) {
      try {
         ++field9784;
         if (arg0 == null) {
            return null;
         } else {
            class499 var3 = arg0.method842((byte)50);
            if (class238.field3011 == var3) {
               return new class28((class300)arg0);
            } else if (class495.field6912 == var3) {
               return new class472(this.method4809(true), (class548)arg0);
            } else if (class359.field4999 == var3) {
               return new class147(this.field9780, (class366)arg0);
            } else {
               if (arg1 <= 4) {
                  this.method4809(false);
               }

               if (class188.field2390 == var3) {
                  return new class295(this.field9780, (class555)arg0);
               } else if (class763.field11167 == var3) {
                  return new class460(this.field9780, this.field9779, (class259)arg0);
               } else if (class569.field8363 == var3) {
                  return new class573(this.field9780, this.field9779, (class630)arg0);
               } else if (class793.field11596 == var3) {
                  return new class703(this.field9780, this.field9779, (class773)arg0);
               } else if (class447.field6053 == var3) {
                  return new class273(this.field9780, this.field9779, (class91)arg0);
               } else if (class238.field3033 == var3) {
                  return new class503(this.field9780, (class533)arg0);
               } else {
                  return class21.field327 == var3 ? new class354(this.field9780, this.field9779, (class598)arg0) : null;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9785[4] + (arg0 != null ? field9785[1] : field9785[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(Z)Liia;"
   )
   private final class539 method4809(boolean arg0) {
      try {
         if (this.field9783 == null) {
            this.field9783 = new class539();
         }

         if (!arg0) {
            this.method4808((class110)null, -78);
         }

         ++field9782;
         return this.field9783;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9785[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "<init>",
      descriptor = "(Lww;Lww;)V"
   )
   public class655(class339 arg0, class339 arg1) {
      try {
         this.field9780 = arg0;
         this.field9779 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9785[3] + (arg0 != null ? field9785[1] : field9785[0]) + ',' + (arg1 != null ? field9785[1] : field9785[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4810(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4811(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
