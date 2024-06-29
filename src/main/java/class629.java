import java.applet.Applet;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public abstract class class629 extends class22 {
   @OriginalMember(
      owner = "client!ou",
      name = "x",
      descriptor = "[Lou;"
   )
   public class629[] field9173;
   @OriginalMember(
      owner = "client!ou",
      name = "k",
      descriptor = "Z"
   )
   public boolean field9166;
   @OriginalMember(
      owner = "client!ou",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9179 = new String[]{method4624(method4623("c\u0000(VK")), method4624(method4623("X\u001doiCc\u0005ch\u0002x\u001citCh\u001aciCb\u001ar:\u000bm\u0003c:\u0002,\u0016iv\fy\u0007&u\u0016x\u0005sn")), method4624(method4623("c\u0000(_K")), method4624(method4623("b\u0000jv")), method4624(method4623("w[(4\u001e")), method4624(method4623("c\u0000(SK")), method4624(method4623("c\u0000(]K")), method4624(method4623("c\u0000([K")), method4624(method4623("c\u0000(YK")), method4624(method4623("c\u0000(&\nb\u001cr$K")), method4624(method4623("c\u0000(XK")), method4624(method4623("X\u001doiCc\u0005ch\u0002x\u001citCh\u001aciCb\u001ar:\u000bm\u0003c:\u0002,\u0018it\fo\u001dtu\u000eiUio\u0017|\u0000r")), method4624(method4623("c\u0000(PK")), method4624(method4623("c\u0000(RK")), method4624(method4623("c\u0000(^K")), method4624(method4623("c\u0000(\\K")), method4624(method4623("c\u0000(QK"))};
   @OriginalMember(
      owner = "client!ou",
      name = "r",
      descriptor = "I"
   )
   public static int field9159 = 0;
   @OriginalMember(
      owner = "client!ou",
      name = "n",
      descriptor = "Lgh;"
   )
   public static class572 field9162 = new class572(15, -2);
   @OriginalMember(
      owner = "client!ou",
      name = "l",
      descriptor = "I"
   )
   public static int field9160;
   @OriginalMember(
      owner = "client!ou",
      name = "v",
      descriptor = "I"
   )
   public static int field9163;
   @OriginalMember(
      owner = "client!ou",
      name = "B",
      descriptor = "I"
   )
   public static int field9165;
   @OriginalMember(
      owner = "client!ou",
      name = "w",
      descriptor = "I"
   )
   public static int field9167;
   @OriginalMember(
      owner = "client!ou",
      name = "A",
      descriptor = "I"
   )
   public static int field9168;
   @OriginalMember(
      owner = "client!ou",
      name = "C",
      descriptor = "I"
   )
   public static int field9170;
   @OriginalMember(
      owner = "client!ou",
      name = "m",
      descriptor = "I"
   )
   public static int field9171;
   @OriginalMember(
      owner = "client!ou",
      name = "q",
      descriptor = "I"
   )
   public static int field9172;
   @OriginalMember(
      owner = "client!ou",
      name = "u",
      descriptor = "I"
   )
   public static int field9174;
   @OriginalMember(
      owner = "client!ou",
      name = "p",
      descriptor = "I"
   )
   public int field9175;
   @OriginalMember(
      owner = "client!ou",
      name = "o",
      descriptor = "I"
   )
   public static int field9176;
   @OriginalMember(
      owner = "client!ou",
      name = "s",
      descriptor = "I"
   )
   public static int field9177;
   @OriginalMember(
      owner = "client!ou",
      name = "j",
      descriptor = "Lef;"
   )
   public class511 field9161;
   @OriginalMember(
      owner = "client!ou",
      name = "t",
      descriptor = "Lsga;"
   )
   public class75 field9169;
   @OriginalMember(
      owner = "client!ou",
      name = "y",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field9164;
   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field9178;

   @OriginalMember(
      owner = "client!ou",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method4619(int arg0) {
      try {
         field9178 = null;
         field9164 = null;
         if (arg0 < 44) {
            method4619(-51);
         }

         field9162 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9179[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(I)I"
   )
   public int method1951(int arg0) {
      try {
         if (arg0 != -3) {
            this.method1953(114);
         }

         ++field9176;
         return -1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9179[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(III)V"
   )
   public void method3477(int arg0, int arg1, int arg2) {
      try {
         ++field9174;
         int var4 = this.field9175 == 255 ? arg1 : this.field9175;
         int var5 = -49 % ((-73 - arg0) / 47);
         if (this.field9166) {
            this.field9161 = new class511(var4, arg1, arg2);
         } else {
            this.field9169 = new class75(var4, arg1, arg2);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9179[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(IIILoo;II)Ljava/awt/Frame;"
   )
   public static final Frame method4620(int arg0, int arg1, int arg2, class651 arg3, int arg4, int arg5) {
      boolean var6 = client.field4564;

      try {
         ++field9172;
         if (!arg3.method4791(-22516)) {
            return null;
         } else {
            if (arg0 == 0) {
               class211[] var7 = class209.method1779(-120, arg3);
               if (var7 == null) {
                  return null;
               }

               int var10000;
               label114: {
                  byte var8 = 0;
                  int var9 = 0;
                  if (var6) {
                     var10000 = ~arg5;
                  } else if (~var9 <= ~var7.length) {
                     var10000 = var8;
                     if (!var6) {
                        break label114;
                     }
                  } else {
                     var10000 = ~arg5;
                  }

                  while(true) {
                     if (var10000 == ~var7[var9].field3149) {
                        if (var7[var9].field3151 == arg1) {
                           if (~arg4 != -1) {
                              if (~var7[var9].field3148 == ~arg4) {
                                 if (var8 != 0) {
                                    if (var7[var9].field3147 > arg0) {
                                       var8 = 1;
                                       arg0 = var7[var9].field3147;
                                       ++var9;
                                    } else {
                                       ++var9;
                                    }
                                 } else {
                                    var8 = 1;
                                    arg0 = var7[var9].field3147;
                                    ++var9;
                                 }
                              } else {
                                 ++var9;
                              }
                           } else if (var8 != 0) {
                              if (var7[var9].field3147 > arg0) {
                                 var8 = 1;
                                 arg0 = var7[var9].field3147;
                                 ++var9;
                              } else {
                                 ++var9;
                              }
                           } else {
                              var8 = 1;
                              arg0 = var7[var9].field3147;
                              ++var9;
                           }
                        } else {
                           ++var9;
                        }
                     } else {
                        ++var9;
                     }

                     if (~var9 <= ~var7.length) {
                        var10000 = var8;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = ~arg5;
                     }
                  }
               }

               if (var10000 == 0) {
                  return null;
               }
            }

            class789 var10 = arg3.method4779(arg4, arg1, arg0, -807957232, arg5);
            if (var6) {
               class624.method4569((byte)98, 10L);
            }

            while(~var10.field11542 == -1) {
               class624.method4569((byte)98, 10L);
            }

            Frame var11 = (Frame)var10.field11537;
            if (var11 == null) {
               return null;
            } else if (~var10.field11542 == -3) {
               class129.method1245(-1, arg3, var11);
               return null;
            } else {
               if (arg2 != -28109) {
                  method4619(-94);
               }

               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field9179[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9179[4] : field9179[3]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "b",
      descriptor = "(I)V"
   )
   public void method901(int arg0) {
      try {
         if (arg0 != 245880940) {
            this.field9169 = null;
         }

         ++field9167;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9179[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "b",
      descriptor = "(III)[[I"
   )
   public final int[][] method4621(int arg0, int arg1, int arg2) {
      try {
         int var4 = -61 / ((-63 - arg0) / 41);
         ++field9165;
         if (!this.field9173[arg1].field9166) {
            return this.field9173[arg1].method243(arg2, 0);
         } else {
            int[] var5 = this.field9173[arg1].method45(arg2, 2048);
            return new int[][]{var5, var5, var5};
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field9179[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(BII)[I"
   )
   public final int[] method4622(byte arg0, int arg1, int arg2) {
      try {
         ++field9177;
         if (arg0 < 114) {
            return null;
         } else {
            return this.field9173[arg1].field9166 ? this.field9173[arg1].method45(arg2, 2048) : this.field9173[arg1].method243(arg2, 0)[0];
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9179[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "b",
      descriptor = "(II)[I"
   )
   public int[] method45(int arg0, int arg1) {
      try {
         if (arg1 != 2048) {
            this.method3478((byte)116);
         }

         ++field9160;
         throw new IllegalStateException(field9179[11]);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9179[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "f",
      descriptor = "(I)V"
   )
   public void method1953(int arg0) {
      try {
         ++field9171;
         if (arg0 <= 48) {
            field9164 = null;
         }

         if (this.field9166) {
            this.field9161.method3868(-10846);
            this.field9161 = null;
         } else {
            this.field9169.method786(0);
            this.field9169 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9179[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(II)[[I"
   )
   public int[][] method243(int arg0, int arg1) {
      try {
         ++field9168;
         if (arg1 != 0) {
            return null;
         } else {
            throw new IllegalStateException(field9179[1]);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9179[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(B)I"
   )
   public int method3478(byte arg0) {
      try {
         ++field9163;
         return arg0 < 100 ? -27 : -1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9179[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   public class629(int arg0, boolean arg1) {
      try {
         this.field9173 = new class629[arg0];
         this.field9166 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9179[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public void method241(class473 arg0, int arg1, int arg2) {
      try {
         if (arg1 != 0) {
            this.field9166 = false;
         }

         ++field9170;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9179[2] + (arg0 != null ? field9179[4] : field9179[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4623(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4624(char[] arg0) {
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
            var10005 = 117;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
