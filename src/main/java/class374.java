import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class374 {
   @OriginalMember(
      owner = "client!du",
      name = "j",
      descriptor = "Lwia;"
   )
   private class791 field5676 = new class791(256);
   @OriginalMember(
      owner = "client!du",
      name = "b",
      descriptor = "Lwia;"
   )
   private class791 field5679 = new class791(256);
   @OriginalMember(
      owner = "client!du",
      name = "d",
      descriptor = "Leaa;"
   )
   private class526 field5670;
   @OriginalMember(
      owner = "client!du",
      name = "f",
      descriptor = "Leaa;"
   )
   private class526 field5673;
   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5681 = new String[]{method2906(method2905("_j\"?n")), method2906(method2905("Uj`\u0010")), method2906(method2905("@1\"R;")), method2906(method2905("_j\"@/UvxBn")), method2906(method2905("_j\"=n")), method2906(method2905("_j\">n")), method2906(method2905("_j\"9n")), method2906(method2905("_j\":n")), method2906(method2905("_j\"8n"))};
   @OriginalMember(
      owner = "client!du",
      name = "e",
      descriptor = "I"
   )
   public static int field5672 = 0;
   @OriginalMember(
      owner = "client!du",
      name = "g",
      descriptor = "I"
   )
   public static int field5669;
   @OriginalMember(
      owner = "client!du",
      name = "i",
      descriptor = "I"
   )
   public static int field5671;
   @OriginalMember(
      owner = "client!du",
      name = "h",
      descriptor = "I"
   )
   public static int field5675;
   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "I"
   )
   public static int field5677;
   @OriginalMember(
      owner = "client!du",
      name = "c",
      descriptor = "I"
   )
   public static int field5678;
   @OriginalMember(
      owner = "client!du",
      name = "l",
      descriptor = "I"
   )
   public static int field5680;
   @OriginalMember(
      owner = "client!du",
      name = "k",
      descriptor = "[[Z"
   )
   public static boolean[][] field5674;

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(FIFF)I"
   )
   public static final int method2899(float arg0, int arg1, float arg2, float arg3) {
      try {
         ++field5678;
         float var4 = !(arg2 < 0.0F) ? arg2 : -arg2;
         float var5 = !(arg3 < 0.0F) ? arg3 : -arg3;
         float var6 = !(arg0 < 0.0F) ? arg0 : -arg0;
         if (arg1 != 587) {
            method2901(37);
         }

         if (var4 < var5 && var6 < var5) {
            return !(arg3 > 0.0F) ? 1 : 0;
         } else if (var4 < var6 && var5 < var6) {
            return arg0 > 0.0F ? 2 : 3;
         } else {
            return arg2 > 0.0F ? 4 : 5;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5681[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(I[III)Ljaa;"
   )
   private final class640 method2900(int arg0, int[] arg1, int arg2, int arg3) {
      try {
         ++field5669;
         int var5 = arg2 ^ ((-1610608641 & arg3) << 4 | arg3 >>> 12);
         int var6 = var5 | arg3 << 16;
         long var7 = (long)var6;
         if (arg0 != -28815) {
            this.field5679 = null;
         }

         class640 var9 = (class640)this.field5679.method5681(var7, -1);
         if (var9 != null) {
            return var9;
         } else if (arg1 != null && ~arg1[0] >= -1) {
            return null;
         } else {
            class294 var10 = class294.method2243(this.field5670, arg3, arg2);
            if (var10 == null) {
               return null;
            } else {
               class640 var11 = var10.method2241();
               this.field5679.method5682(var7, var11, (byte)7);
               if (arg1 != null) {
                  arg1[0] -= var11.field9329.length;
               }

               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field5681[5] + arg0 + ',' + (arg1 != null ? field5681[2] : field5681[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2901(int arg0) {
      try {
         field5674 = null;
         if (arg0 != 0) {
            field5674 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5681[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(Z[II)Ljaa;"
   )
   public final class640 method2902(boolean arg0, int[] arg1, int arg2) {
      try {
         ++field5680;
         if (~this.field5670.method3903((byte)-126) == -2) {
            return this.method2900(-28815, arg1, arg2, 0);
         } else if (!arg0) {
            return null;
         } else if (~this.field5670.method3875(0, arg2) == -2) {
            return this.method2900(-28815, arg1, 0, arg2);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5681[0] + arg0 + ',' + (arg1 != null ? field5681[2] : field5681[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "b",
      descriptor = "(Z[II)Ljaa;"
   )
   public final class640 method2903(boolean arg0, int[] arg1, int arg2) {
      try {
         if (!arg0) {
            return null;
         } else {
            ++field5675;
            if (this.field5673.method3903((byte)105) == 1) {
               return this.method2904(arg1, arg2, (byte)127, 0);
            } else if (~this.field5673.method3875(0, arg2) == -2) {
               return this.method2904(arg1, 0, (byte)127, arg2);
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5681[7] + arg0 + ',' + (arg1 != null ? field5681[2] : field5681[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "([IIBI)Ljaa;"
   )
   private final class640 method2904(int[] arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field5677;
         int var5 = arg1 ^ (arg3 >>> 12 | (arg3 & 1342181375) << 4);
         int var6 = var5 | arg3 << 16;
         long var7 = (long)var6 ^ 4294967296L;
         class640 var9 = (class640)this.field5679.method5681(var7, -1);
         if (var9 != null) {
            return var9;
         } else if (arg0 != null && ~arg0[0] >= -1) {
            return null;
         } else {
            if (arg2 != 127) {
               this.method2904((int[])null, 38, (byte)112, -16);
            }

            class116 var10 = (class116)this.field5676.method5681(var7, -1);
            if (var10 == null) {
               var10 = class116.method974(this.field5673, arg3, arg1);
               if (var10 == null) {
                  return null;
               }

               this.field5676.method5682(var7, var10, (byte)7);
            }

            class640 var11 = var10.method970(arg0);
            if (var11 == null) {
               return null;
            } else {
               var10.method2720(0);
               this.field5679.method5682(var7, var11, (byte)7);
               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field5681[4] + (arg0 != null ? field5681[2] : field5681[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "<init>",
      descriptor = "(Leaa;Leaa;)V"
   )
   public class374(class526 arg0, class526 arg1) {
      try {
         this.field5670 = arg0;
         this.field5673 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5681[3] + (arg0 != null ? field5681[2] : field5681[1]) + ',' + (arg1 != null ? field5681[2] : field5681[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2905(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2906(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
