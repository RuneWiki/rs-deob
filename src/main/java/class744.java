import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public abstract class class744 extends class347 {
   @OriginalMember(
      owner = "client!lja",
      name = "i",
      descriptor = "I"
   )
   public int field11038;
   @OriginalMember(
      owner = "client!lja",
      name = "t",
      descriptor = "F"
   )
   public float field11028;
   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "I"
   )
   public int field11027;
   @OriginalMember(
      owner = "client!lja",
      name = "k",
      descriptor = "I"
   )
   public int field11031;
   @OriginalMember(
      owner = "client!lja",
      name = "u",
      descriptor = "I"
   )
   private int field11032;
   @OriginalMember(
      owner = "client!lja",
      name = "w",
      descriptor = "I"
   )
   private int field11036;
   @OriginalMember(
      owner = "client!lja",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11044 = new String[]{method5427(method5426("|WH\u001858")), method5427(method5426("|WH\u001898")), method5427(method5426("~HEZ")), method5427(method5426("k\u0013\u0007\u0018\u0001")), method5427(method5426("|WH\u0018:8")), method5427(method5426("|WH\u001848")), method5427(method5426("|WH\u0018@yS@BB8")), method5427(method5426("|WH\u0018=8")), method5427(method5426("|WH\u0018;8")), method5427(method5426("|WH\u001868")), method5427(method5426("|WH\u0018?8")), method5427(method5426("|WH\u001878"))};
   @OriginalMember(
      owner = "client!lja",
      name = "v",
      descriptor = "[F"
   )
   public static float[] field11026 = new float[4];
   @OriginalMember(
      owner = "client!lja",
      name = "r",
      descriptor = "Ljca;"
   )
   public static class712 field11034 = new class712();
   @OriginalMember(
      owner = "client!lja",
      name = "x",
      descriptor = "I"
   )
   public static int field11043 = 0;
   @OriginalMember(
      owner = "client!lja",
      name = "o",
      descriptor = "I"
   )
   public static int field11025;
   @OriginalMember(
      owner = "client!lja",
      name = "s",
      descriptor = "I"
   )
   public static int field11029;
   @OriginalMember(
      owner = "client!lja",
      name = "l",
      descriptor = "I"
   )
   public static int field11030;
   @OriginalMember(
      owner = "client!lja",
      name = "p",
      descriptor = "I"
   )
   public static int field11033;
   @OriginalMember(
      owner = "client!lja",
      name = "y",
      descriptor = "I"
   )
   public static int field11035;
   @OriginalMember(
      owner = "client!lja",
      name = "m",
      descriptor = "I"
   )
   public static int field11037;
   @OriginalMember(
      owner = "client!lja",
      name = "j",
      descriptor = "I"
   )
   public static int field11039;
   @OriginalMember(
      owner = "client!lja",
      name = "q",
      descriptor = "I"
   )
   public static int field11040;
   @OriginalMember(
      owner = "client!lja",
      name = "B",
      descriptor = "I"
   )
   public static int field11041;
   @OriginalMember(
      owner = "client!lja",
      name = "n",
      descriptor = "Lat;"
   )
   public static class396 field11042;

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method1397(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!lja",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method5417(int arg0) {
      try {
         field11026 = null;
         if (arg0 > -14) {
            method5417(-69);
         }

         field11042 = null;
         field11034 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11044[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method5418(int arg0, byte arg1) {
      try {
         ++field11035;
         if (arg1 > -72) {
            method5418(84, (byte)111);
         }

         class403 var2 = class453.method3410((long)arg0, true, 2);
         var2.method3096((byte)127);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11044[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(FB)V"
   )
   public abstract void method1398(float arg0, byte arg1);

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(BLvha;)I"
   )
   public static final int method5419(byte arg0, class713 arg1) {
      try {
         ++field11030;
         if (arg0 < 79) {
            return 72;
         } else if (class171.field2116 == arg1) {
            return 9216;
         } else if (class448.field6808 != arg1) {
            if (class104.field1257 == arg1) {
               return 34066;
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            return 34065;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11044[1] + arg0 + ',' + (arg1 != null ? field11044[3] : field11044[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method5420(boolean arg0) {
      try {
         if (!arg0) {
            this.field11038 = 30;
         }

         ++field11037;
         return this.field11038;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11044[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5421(int arg0) {
      try {
         ++field11040;
         if (arg0 > -56) {
            this.method5421(113);
         }

         return this.field11032;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11044[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(B)F"
   )
   public final float method5422(byte arg0) {
      try {
         if (arg0 <= 56) {
            this.field11036 = -41;
         }

         ++field11041;
         return this.field11028;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11044[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method5423(int arg0) {
      try {
         if (arg0 != 3378) {
            return -76;
         } else {
            ++field11025;
            return this.field11031;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11044[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class744(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         this.field11038 = arg0;
         this.field11028 = arg5;
         this.field11027 = arg2;
         this.field11031 = arg1;
         this.field11032 = arg4;
         this.field11036 = arg3;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11044[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method5424(int arg0) {
      try {
         ++field11039;
         if (arg0 != 34065) {
            this.method5425((byte)-123);
         }

         return this.field11036;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11044[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method5425(byte arg0) {
      try {
         ++field11033;
         if (arg0 != -81) {
            method5418(-76, (byte)101);
         }

         return this.field11027;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11044[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5426(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5427(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
