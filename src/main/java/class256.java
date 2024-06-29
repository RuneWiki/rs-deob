import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class256 extends class70 {
   @OriginalMember(
      owner = "client!cja",
      name = "H",
      descriptor = "I"
   )
   private int field3868 = 4096;
   @OriginalMember(
      owner = "client!cja",
      name = "O",
      descriptor = "I"
   )
   private int field3867 = 0;
   @OriginalMember(
      owner = "client!cja",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3872 = new String[]{method2167(method2166("ob3yv$")), method2167(method2166("ob3yt$")), method2167(method2166("ob3y\u007f$")), method2167(method2166("b}>;")), method2167(method2166("w&|yJ")), method2167(method2166("ob3ys$")), method2167(method2166("ob3yr$"))};
   @OriginalMember(
      owner = "client!cja",
      name = "F",
      descriptor = "Lpba;"
   )
   public static class746 field3864 = new class746();
   @OriginalMember(
      owner = "client!cja",
      name = "J",
      descriptor = "Lhr;"
   )
   public static class666 field3869 = new class666();
   @OriginalMember(
      owner = "client!cja",
      name = "K",
      descriptor = "I"
   )
   public static int field3871 = 0;
   @OriginalMember(
      owner = "client!cja",
      name = "I",
      descriptor = "Lnaa;"
   )
   public static class113 field3870 = new class113(66, -1);
   @OriginalMember(
      owner = "client!cja",
      name = "N",
      descriptor = "I"
   )
   public static int field3862;
   @OriginalMember(
      owner = "client!cja",
      name = "G",
      descriptor = "I"
   )
   public static int field3863;
   @OriginalMember(
      owner = "client!cja",
      name = "M",
      descriptor = "I"
   )
   public static int field3865;
   @OriginalMember(
      owner = "client!cja",
      name = "L",
      descriptor = "I"
   )
   public static int field3866;

   @OriginalMember(
      owner = "client!cja",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method2163(int arg0) {
      try {
         ++field3862;
         if (arg0 != 23362722) {
            method2164((class289)null, -121);
         }

         if (!class185.field2912) {
            class185.field2912 = true;
            class479.field7286 = true;
            class156.field2327 += (12.0F - class156.field2327) / 2.0F;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3872[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         ++field3863;
         if (arg0 != -1) {
            this.method8((byte)63, -124);
         }

         if (~arg1 != -1) {
            if (~arg1 != -2) {
               return;
            }

            if (!client.field1786) {
               this.field3868 = arg2.method2848(arg0 + -103);
               return;
            }
         }

         this.field3867 = arg2.method2848(arg0 ^ 95);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3872[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3872[4] : field3872[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(Lsu;I)[Leja;"
   )
   public static final class738[] method2164(class289 arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field3865;
         if (!arg0.method2428(13)) {
            return new class738[0];
         } else {
            if (arg1 >= -68) {
               field3870 = null;
            }

            class275 var3 = arg0.method2434(4);
            if (var2) {
               class697.method5128(10L, 120);
            }

            while(var3.field4398 == 0) {
               class697.method5128(10L, 120);
            }

            if (~var3.field4398 == -3) {
               return new class738[0];
            } else {
               int[] var4 = (int[])var3.field4401;
               class738[] var5 = new class738[var4.length >> 2];
               int var6 = 0;
               if (!var2 && var6 >= var5.length) {
                  return var5;
               } else {
                  do {
                     class738 var7 = new class738();
                     var5[var6] = var7;
                     var7.field10971 = var4[var6 << 2];
                     var7.field10972 = var4[(var6 << 2) + 1];
                     var7.field10965 = var4[(var6 << 2) + 2];
                     var7.field10970 = var4[(var6 << 2) + 3];
                     ++var6;
                  } while(var6 < var5.length);

                  return var5;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field3872[6] + (arg0 != null ? field3872[4] : field3872[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field3866;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (arg0 != 87) {
            this.method274(47, 92, (class354)null);
         }

         if (super.field923.field7284) {
            int[] var5 = this.method545(0, arg1, (byte)-112);
            int var6 = 0;
            if (var3 || var6 < class678.field10127) {
               do {
                  int var7 = var5[var6];
                  var4[var6] = this.field3867 <= var7 ? (this.field3868 < var7 ? 0 : 4096) : 0;
                  ++var6;
               } while(var6 < class678.field10127);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field3872[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "<init>",
      descriptor = "()V"
   )
   public class256() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!cja",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method2165(boolean arg0) {
      try {
         field3869 = null;
         if (arg0) {
            field3870 = null;
         }

         field3870 = null;
         field3864 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3872[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2166(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2167(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
