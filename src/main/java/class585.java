import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class585 extends class629 {
   @OriginalMember(
      owner = "client!ug",
      name = "F",
      descriptor = "I"
   )
   private int field8453 = 20;
   @OriginalMember(
      owner = "client!ug",
      name = "I",
      descriptor = "I"
   )
   private int field8457 = 0;
   @OriginalMember(
      owner = "client!ug",
      name = "M",
      descriptor = "I"
   )
   private int field8459 = 0;
   @OriginalMember(
      owner = "client!ug",
      name = "K",
      descriptor = "I"
   )
   private int field8462 = 1365;
   @OriginalMember(
      owner = "client!ug",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8464 = new String[]{method4341(method4340("\u0012;>\u0019D")), method4341(method4340("\u0012;>\u001eD")), method4341(method4340("\u0012;>\u001dD")), method4341(method4340("\"\u0013V")), method4341(method4340("\u0012;>\u001cD")), method4341(method4340("\u0012;>\u0016D")), method4341(method4340("\u001cr>}\u0011")), method4341(method4340("\t)|?"))};
   @OriginalMember(
      owner = "client!ug",
      name = "J",
      descriptor = "Lgh;"
   )
   public static class572 field8455 = new class572(45, 7);
   @OriginalMember(
      owner = "client!ug",
      name = "H",
      descriptor = "I"
   )
   public static int field8463 = 0;
   @OriginalMember(
      owner = "client!ug",
      name = "E",
      descriptor = "I"
   )
   public static int field8454;
   @OriginalMember(
      owner = "client!ug",
      name = "D",
      descriptor = "I"
   )
   public static int field8456;
   @OriginalMember(
      owner = "client!ug",
      name = "L",
      descriptor = "I"
   )
   public static int field8458;
   @OriginalMember(
      owner = "client!ug",
      name = "N",
      descriptor = "I"
   )
   public static int field8460;
   @OriginalMember(
      owner = "client!ug",
      name = "G",
      descriptor = "I"
   )
   public static int field8461;

   @OriginalMember(
      owner = "client!ug",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4337(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         if (arg1 != 0) {
            this.field8462 = 122;
         }

         label54: {
            label53: {
               label52: {
                  label51: {
                     if (arg2 != 0) {
                        if (~arg2 == -2) {
                           break label51;
                        }

                        if (~arg2 == -3) {
                           break label52;
                        }

                        if (~arg2 != -4) {
                           break label54;
                        }

                        if (!var4) {
                           break label53;
                        }
                     }

                     this.field8462 = arg0.method3565(true);
                     if (!var4) {
                        break label54;
                     }
                  }

                  this.field8453 = arg0.method3565(true);
                  if (!var4) {
                     break label54;
                  }
               }

               this.field8459 = arg0.method3565(true);
               if (!var4) {
                  break label54;
               }
            }

            this.field8457 = arg0.method3565(true);
         }

         ++field8456;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8464[5] + (arg0 != null ? field8464[6] : field8464[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 2048) {
            return null;
         } else {
            ++field8460;
            int[] var4 = super.field9161.method3870((byte)56, arg0);
            if (super.field9161.field7474) {
               int var5 = 0;
               int var10000;
               int var10001;
               if (var3 || var5 < class66.field1214) {
                  label67:
                  do {
                     do {
                        int var14;
                        label63: {
                           int var6 = (class429.field6201[var5] << 12) / this.field8462 + this.field8459;
                           int var7 = (class442.field6448[arg0] << 12) / this.field8462 - -this.field8457;
                           int var8 = var6;
                           int var9 = var7;
                           int var10 = var6;
                           int var11 = var7;
                           int var12 = var6 * var6 >> 12;
                           int var13 = var7 * var7 >> 12;
                           var14 = 0;
                           if (!var3) {
                              if (~(var12 + var13) <= -16385) {
                                 break label63;
                              }

                              var10000 = var14;
                              var10001 = this.field8453;
                              if (var3) {
                                 continue label67;
                              }

                              if (var14 >= var10001) {
                                 break label63;
                              }
                           }

                           do {
                              var11 = (var10 * var11 >> 12) * 2 + var9;
                              var10 = -var13 - -var8 + var12;
                              ++var14;
                              var12 = var10 * var10 >> 12;
                              var13 = var11 * var11 >> 12;
                              if (~(var12 + var13) <= -16385) {
                                 break;
                              }

                              var10000 = var14;
                              var10001 = this.field8453;
                              if (var3) {
                                 continue label67;
                              }
                           } while(var14 < var10001);
                        }

                        var4[var5] = ~var14 <= ~(this.field8453 - 1) ? 0 : (var14 << 12) / this.field8453;
                        ++var5;
                     } while(var5 < class66.field1214);

                     return var4;
                  } while(var10000 < var10001);
               }
            }

            return var4;
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field8464[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method4338(boolean arg0) {
      try {
         if (!arg0) {
            method4337((byte)19);
         }

         field8455 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8464[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "<init>",
      descriptor = "()V"
   )
   public class585() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ug",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method4339(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field8454;
         class479 var2 = null;

         try {
            class789 var3 = class412.field6033.method4789("2", -5160, true);
            if (var1) {
               class624.method4569((byte)98, 1L);
            }

            while(true) {
               int var10000;
               if (var3.field11542 != 0) {
                  var10000 = var3.field11542;
                  if (!var1) {
                     if (var10000 == 1) {
                        var2 = (class479)var3.field11537;
                        byte[] var4 = new byte[(int)var2.method3625(-7269)];
                        int var5 = 0;
                        if (var1 || var4.length > var5) {
                           do {
                              int var6 = var2.method3626(var4, var4.length + -var5, var5, (byte)-59);
                              if (~var6 == 0) {
                                 throw new IOException(field8464[3]);
                              }

                              var5 += var6;
                           } while(var4.length > var5);
                        }

                        class546.method4081(new class473(var4), 0);
                     }
                     break;
                  }
               } else {
                  var10000 = 98;
               }

               class624.method4569((byte)var10000, 1L);
            }
         } catch (Exception var10) {
         }

         try {
            if (var2 != null) {
               var2.method3627((byte)2);
            }
         } catch (Exception var9) {
         }

         int var7 = -85 % ((arg0 - -16) / 33);
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field8464[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4340(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4341(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
