import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class687 extends class70 {
   @OriginalMember(
      owner = "client!kba",
      name = "G",
      descriptor = "I"
   )
   private int field10215 = 20;
   @OriginalMember(
      owner = "client!kba",
      name = "H",
      descriptor = "I"
   )
   private int field10211 = 0;
   @OriginalMember(
      owner = "client!kba",
      name = "I",
      descriptor = "I"
   )
   private int field10214 = 0;
   @OriginalMember(
      owner = "client!kba",
      name = "M",
      descriptor = "I"
   )
   private int field10216 = 1365;
   @OriginalMember(
      owner = "client!kba",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10217 = new String[]{method5066(method5065(",9c\u0016zo")), method5066(method5065(",9c\u0016xo")), method5066(method5065(").nT")), method5066(method5065(",9c\u0016qo")), method5066(method5065("<u,\u0016D"))};
   @OriginalMember(
      owner = "client!kba",
      name = "L",
      descriptor = "[F"
   )
   public static float[] field10210 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   @OriginalMember(
      owner = "client!kba",
      name = "F",
      descriptor = "I"
   )
   public static int field10209;
   @OriginalMember(
      owner = "client!kba",
      name = "K",
      descriptor = "I"
   )
   public static int field10212;
   @OriginalMember(
      owner = "client!kba",
      name = "J",
      descriptor = "Lmp;"
   )
   public static class41 field10213;

   @OriginalMember(
      owner = "client!kba",
      name = "<init>",
      descriptor = "()V"
   )
   public class687() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!kba",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method5064(int arg0) {
      try {
         if (arg0 != 3802) {
            field10210 = null;
         }

         field10210 = null;
         field10213 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10217[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field10212;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (super.field923.field7284) {
            int var5 = 0;
            int var10000;
            int var10001;
            if (var3 || ~var5 > ~class678.field10127) {
               label68:
               do {
                  do {
                     int var14;
                     label64: {
                        int var6 = (class199.field3060[var5] << 12) / this.field10216 - -this.field10211;
                        int var7 = (class204.field3113[arg1] << 12) / this.field10216 + this.field10214;
                        int var8 = var6;
                        int var9 = var7;
                        int var10 = var6;
                        int var11 = var7;
                        int var12 = var6 * var6 >> 12;
                        int var13 = var7 * var7 >> 12;
                        var14 = 0;
                        if (!var3) {
                           if (var12 + var13 >= 16384) {
                              break label64;
                           }

                           var10000 = this.field10215;
                           var10001 = var14;
                           if (var3) {
                              continue label68;
                           }

                           if (var10000 <= var14) {
                              break label64;
                           }
                        }

                        do {
                           var11 = (var10 * var11 >> 12) * 2 - -var9;
                           var10 = -var13 + var12 - -var8;
                           ++var14;
                           var12 = var10 * var10 >> 12;
                           var13 = var11 * var11 >> 12;
                           if (var12 + var13 >= 16384) {
                              break;
                           }

                           var10000 = this.field10215;
                           var10001 = var14;
                           if (var3) {
                              continue label68;
                           }
                        } while(var10000 > var14);
                     }

                     var4[var5] = ~var14 > ~(this.field10215 + -1) ? (var14 << 12) / this.field10215 : 0;
                     ++var5;
                  } while(~var5 > ~class678.field10127);

                  return arg0 != 87 ? null : var4;
               } while(var10000 > var10001);
            }
         }

         return arg0 != 87 ? null : var4;
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field10217[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label55: {
            label54: {
               label53: {
                  label52: {
                     if (arg1 != 0) {
                        if (arg1 == 1) {
                           break label52;
                        }

                        if (~arg1 == -3) {
                           break label53;
                        }

                        if (~arg1 != -4) {
                           break label55;
                        }

                        if (!var4) {
                           break label54;
                        }
                     }

                     this.field10216 = arg2.method2848(-103);
                     if (!var4) {
                        break label55;
                     }
                  }

                  this.field10215 = arg2.method2848(-107);
                  if (!var4) {
                     break label55;
                  }
               }

               this.field10211 = arg2.method2848(-120);
               if (!var4) {
                  break label55;
               }
            }

            this.field10214 = arg2.method2848(-103);
         }

         if (arg0 == -1) {
            ++field10209;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10217[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10217[4] : field10217[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5065(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5066(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
