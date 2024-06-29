import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class66 extends class70 {
   @OriginalMember(
      owner = "client!ek",
      name = "F",
      descriptor = "I"
   )
   private int field871 = 585;
   @OriginalMember(
      owner = "client!ek",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field875 = new String[]{method512(method511("0\u0011[\f\u001f")), method512(method511("0\u0011[\r\u001f")), method512(method511(";\u000f\u0019%")), method512(method511("0\u0011[\u0001\u001f")), method512(method511(".T[gJ")), method512(method511("0\u0011[\b\u001f")), method512(method511("0\u0011[\n\u001f"))};
   @OriginalMember(
      owner = "client!ek",
      name = "L",
      descriptor = "Luk;"
   )
   public static class498 field872 = new class498(47, 1);
   @OriginalMember(
      owner = "client!ek",
      name = "G",
      descriptor = "I"
   )
   public static int field868;
   @OriginalMember(
      owner = "client!ek",
      name = "I",
      descriptor = "I"
   )
   public static int field869;
   @OriginalMember(
      owner = "client!ek",
      name = "J",
      descriptor = "I"
   )
   public static int field870;
   @OriginalMember(
      owner = "client!ek",
      name = "H",
      descriptor = "I"
   )
   public static int field873;
   @OriginalMember(
      owner = "client!ek",
      name = "K",
      descriptor = "Lsda;"
   )
   public static class223 field874;

   @OriginalMember(
      owner = "client!ek",
      name = "b",
      descriptor = "(B)V",
      line = 6
   )
   public static void method508(byte arg0) {
      try {
         field874 = null;
         field872 = null;
         if (arg0 != -29) {
            method510(125);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field875[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "<init>",
      descriptor = "()V",
      line = 17
   )
   public class66() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(IILica;)V",
      line = 20
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         if (arg1 == 0) {
            this.field871 = arg2.method2848(arg0 ^ 120);
         }

         ++field870;
         if (arg0 != -1) {
            this.method274(-19, 12, (class354)null);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field875[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field875[4] : field875[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(BI)[I",
      line = 46
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field873;
         int[] var4 = super.field923.method3718(arg0 ^ -87, arg1);
         if (arg0 != 87) {
            method508((byte)-124);
         }

         if (super.field923.field7284) {
            int var5 = class204.field3113[arg1];
            int var6 = 0;
            if (var3 || class678.field10127 > var6) {
               do {
                  label111: {
                     int var7 = class199.field3060[var6];
                     if (this.field871 < var7 && ~var7 > ~(-this.field871 + 4096) && ~var5 < ~(-this.field871 + 2048) && this.field871 + 2048 > var5) {
                        int var8 = -var7 + 2048;
                        int var9 = var8 >= 0 ? var8 : -var8;
                        int var10 = var9 << 12;
                        int var11 = var10 / (-this.field871 + 2048);
                        var4[var6] = -var11 + 4096;
                        if (!var3) {
                           break label111;
                        }
                     }

                     if (~(2048 - this.field871) > ~var7 && ~(this.field871 + 2048) < ~var7) {
                        int var12 = var5 + -2048;
                        int var13 = var12 < 0 ? -var12 : var12;
                        int var14 = var13 - this.field871;
                        int var15 = var14 << 12;
                        var4[var6] = var15 / (-this.field871 + 2048);
                        if (!var3) {
                           break label111;
                        }
                     }

                     if (var5 < this.field871 || 4096 - this.field871 < var5) {
                        int var16 = var7 + -2048;
                        int var17 = ~var16 > -1 ? -var16 : var16;
                        int var18 = var17 - this.field871;
                        int var19 = var18 << 12;
                        var4[var6] = var19 / (-this.field871 + 2048);
                        if (!var3) {
                           break label111;
                        }
                     }

                     if (this.field871 > var7 || var7 > -this.field871 + 4096) {
                        int var20 = -var5 + 2048;
                        int var21 = var20 < 0 ? -var20 : var20;
                        int var22 = var21 << 12;
                        int var23 = var22 / (-this.field871 + 2048);
                        var4[var6] = -var23 + 4096;
                        if (!var3) {
                           break label111;
                        }
                     }

                     var4[var6] = 0;
                  }

                  ++var6;
               } while(class678.field10127 > var6);
            }
         }

         return var4;
      } catch (RuntimeException var25) {
         throw class482.method3757(var25, field875[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "b",
      descriptor = "(III)Z",
      line = 137
   )
   public static final boolean method509(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 2048) {
            field872 = null;
         }

         ++field869;
         return false;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field875[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "g",
      descriptor = "(I)V",
      line = 148
   )
   public static final void method510(int arg0) {
      try {
         if (arg0 != 20019) {
            method509(-47, 101, -69);
         }

         class511.field7812.method3186(false);
         ++field868;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field875[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method511(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method512(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
