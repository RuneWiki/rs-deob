import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class390 extends class70 {
   @OriginalMember(
      owner = "client!ij",
      name = "K",
      descriptor = "I"
   )
   private int field5401;
   @OriginalMember(
      owner = "client!ij",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5410 = new String[]{method3088(method3087("k0ewg")), method3088(method3087("k0e|g")), method3088(method3087("k0epg")), method3088(method3087("l/'_")), method3088(method3087("yte\u001d2")), method3088(method3087("k0etg")), method3088(method3087("k0e\u000f&l3?\rg")), method3088(method3087("rkyl)w6'")), method3088(method3087("`kyl)w6'")), method3088(method3087("k0evg")), method3088(method3087("rkzl)w6'"))};
   @OriginalMember(
      owner = "client!ij",
      name = "Q",
      descriptor = "Lsia;"
   )
   public static class407 field5406 = new class407(8);
   @OriginalMember(
      owner = "client!ij",
      name = "P",
      descriptor = "J"
   )
   public static long field5408 = 0L;
   @OriginalMember(
      owner = "client!ij",
      name = "N",
      descriptor = "[I"
   )
   public static int[] field5407 = new int[2];
   @OriginalMember(
      owner = "client!ij",
      name = "O",
      descriptor = "I"
   )
   public static int field5402;
   @OriginalMember(
      owner = "client!ij",
      name = "I",
      descriptor = "I"
   )
   public static int field5403;
   @OriginalMember(
      owner = "client!ij",
      name = "J",
      descriptor = "I"
   )
   public static int field5404;
   @OriginalMember(
      owner = "client!ij",
      name = "L",
      descriptor = "I"
   )
   public static int field5405;
   @OriginalMember(
      owner = "client!ij",
      name = "M",
      descriptor = "I"
   )
   public static int field5409;

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(ILhe;[[B)V"
   )
   public static final void method3084(int arg0, class621 arg1, byte[][] arg2) {
      boolean var3 = client.field1481;

      try {
         ++field5402;
         int[] var4 = new int[]{-1, 0, 0, 0, 0};
         int var5 = arg2.length;
         int var6 = 0;
         if (var3 || var5 > var6) {
            do {
               byte[] var7 = arg2[var6];
               if (var7 != null) {
                  class66 var8 = new class66(var7);
                  int var9 = class383.field5321[var6] >> 8;
                  int var10 = 255 & class383.field5321[var6];
                  int var11 = var9 * 64 + -class539.field7889;
                  int var12 = var10 * 64 - class353.field4940;
                  class161.method1344((byte)-104);
                  arg1.method3078(class324.field4438, (byte)-124, var12, class353.field4940, class539.field7889, var11, var8);
                  arg1.method4605(var12, var8, var11, var4, class629.field9294, -121);
                  if (!arg1.field5398 && class751.field10959 / 8 == var9 && class703.field10273 / 8 == var10 && var4[0] != -1) {
                     class676.field9996 = class263.field3339.method2102(class720.field10555, var4[1], var4[2], (byte)108, var4[0], var4[3]);
                     class559.field8193 = var4[4];
                  }
               }

               ++var6;
            } while(var5 > var6);
         }

         int var13 = 0;
         int var10000;
         int var10001;
         if (var3) {
            var10000 = (class383.field5321[var13] >> 8) * 64;
            var10001 = class539.field7889;
         } else if (~var5 >= ~var13) {
            var10000 = arg0;
            var10001 = -97;
            if (!var3) {
               if (arg0 > -97) {
                  method3084(64, (class621)null, (byte[][])null);
                  return;
               }

               return;
            }
         } else {
            var10000 = (class383.field5321[var13] >> 8) * 64;
            var10001 = class539.field7889;
         }

         while(true) {
            int var14 = var10000 - var10001;
            int var15 = (class383.field5321[var13] & 255) * 64 + -class353.field4940;
            byte[] var16 = arg2[var13];
            if (var16 == null && class703.field10273 < 800) {
               class161.method1344((byte)-104);
               arg1.method3071(64, 64, var14, var15, 0);
            }

            ++var13;
            if (~var5 >= ~var13) {
               var10000 = arg0;
               var10001 = -97;
               if (!var3) {
                  if (arg0 > -97) {
                     method3084(64, (class621)null, (byte[][])null);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = (class383.field5321[var13] >> 8) * 64;
               var10001 = class539.field7889;
            }
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field5410[5] + arg0 + ',' + (arg1 != null ? field5410[4] : field5410[3]) + ',' + (arg2 != null ? field5410[4] : field5410[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         if (arg0 > -34) {
            field5407 = null;
         }

         if (arg2 == 0) {
            this.field5401 = (arg1.method640(255) << 12) / 255;
         }

         ++field5405;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5410[2] + arg0 + ',' + (arg1 != null ? field5410[4] : field5410[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      try {
         ++field5404;
         int[] var3 = super.field940.method119(false, arg1);
         if (arg0 != -63) {
            field5406 = null;
         }

         if (super.field940.field270) {
            class349.method2764(var3, 0, class262.field3328, this.field5401);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5410[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "<init>",
      descriptor = "()V"
   )
   public class390() {
      this(4096);
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(Lww;I)V"
   )
   public static final void method3085(class339 arg0, int arg1) {
      try {
         ++field5403;
         class641.field9435 = arg0.method2712(field5410[10], (byte)90);
         int var2 = 72 / ((13 - arg1) / 46);
         class90.field1221 = arg0.method2712(field5410[7], (byte)-110);
         class408.field5631 = arg0.method2712(field5410[8], (byte)41);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5410[9] + (arg0 != null ? field5410[4] : field5410[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method3086(boolean arg0) {
      try {
         if (arg0) {
            field5406 = null;
            field5407 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5410[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class390(int arg0) {
      super(0, true);
      this.field5401 = 4096;

      try {
         this.field5401 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5410[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3087(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3088(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
