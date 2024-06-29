import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class404 extends class523 implements class126 {
   @OriginalMember(
      owner = "client!aha",
      name = "f",
      descriptor = "I"
   )
   private int field5831;
   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5837 = new String[]{method3047(method3046("'Mz1:n")), method3047(method3046("'Mz1=n")), method3047(method3046("(Pws")), method3047(method3046("=\u000b51\u0001")), method3047(method3046("'Mz1?n")), method3047(method3046("'Mz1>n")), method3047(method3046("'Mz19n")), method3047(method3046("'Mz18n")), method3047(method3046("'Mz1@/KrkBn"))};
   @OriginalMember(
      owner = "client!aha",
      name = "j",
      descriptor = "[[I"
   )
   public static int[][] field5835 = new int[6][];
   @OriginalMember(
      owner = "client!aha",
      name = "g",
      descriptor = "Lek;"
   )
   public static class536 field5836 = new class536(91, 4);
   @OriginalMember(
      owner = "client!aha",
      name = "e",
      descriptor = "I"
   )
   public static int field5829;
   @OriginalMember(
      owner = "client!aha",
      name = "i",
      descriptor = "I"
   )
   public static int field5830;
   @OriginalMember(
      owner = "client!aha",
      name = "d",
      descriptor = "I"
   )
   public static int field5832;
   @OriginalMember(
      owner = "client!aha",
      name = "h",
      descriptor = "I"
   )
   public static int field5833;
   @OriginalMember(
      owner = "client!aha",
      name = "c",
      descriptor = "I"
   )
   public static int field5834;

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(I)I",
      line = 3
   )
   public final int method1009(int arg0) {
      try {
         ++field5833;
         return arg0 > -35 ? 13 : this.field5831;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5837[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "b",
      descriptor = "(I)V",
      line = 14
   )
   public static void method3044(int arg0) {
      try {
         field5835 = null;
         if (arg0 != 6408) {
            method3044(-32);
         }

         field5836 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5837[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "<init>",
      descriptor = "(Lea;I[BI)V",
      line = 25
   )
   public class404(class573 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field5831 = arg1;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5837[8] + (arg0 != null ? field5837[3] : field5837[2]) + ',' + arg1 + ',' + (arg2 != null ? field5837[3] : field5837[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(BI[BI)V",
      line = 35
   )
   public final void method1010(byte arg0, int arg1, byte[] arg2, int arg3) {
      try {
         this.method3795(arg2, arg3);
         ++field5829;
         this.field5831 = arg1;
         int var5 = -25 / ((49 - arg0) / 40);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5837[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5837[3] : field5837[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(BI)I",
      line = 46
   )
   public static final int method3045(byte arg0, int arg1) {
      try {
         ++field5830;
         if (~arg1 != -6408 && arg1 != 34843 && arg1 != 34837) {
            if (arg0 != -29) {
               method3045((byte)81, -101);
            }

            if (arg1 != 6408 && ~arg1 != -34843 && arg1 != 34836) {
               if (~arg1 != -6407 && ~arg1 != -34845) {
                  if (~arg1 != -6410 && ~arg1 != -34847) {
                     if (~arg1 != -6411 && ~arg1 != -34848) {
                        if (arg1 == 6402) {
                           return 6402;
                        } else {
                           throw new IllegalArgumentException("");
                        }
                     } else {
                        return 6410;
                     }
                  } else {
                     return 6409;
                  }
               } else {
                  return 6406;
               }
            } else {
               return 6408;
            }
         } else {
            return 6407;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5837[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(B)I",
      line = 80
   )
   public final int method1008(byte arg0) {
      try {
         ++field5832;
         if (arg0 <= 95) {
            this.method1011((byte)-81);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5837[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "b",
      descriptor = "(B)J",
      line = 91
   )
   public final long method1011(byte arg0) {
      try {
         if (arg0 > -119) {
            field5836 = null;
         }

         ++field5834;
         return super.field7510.getAddress();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5837[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3046(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3047(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
