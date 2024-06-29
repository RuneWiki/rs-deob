import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {
   @OriginalMember(
      owner = "client!il",
      name = "r",
      descriptor = "I"
   )
   private int field40 = 32;
   @OriginalMember(
      owner = "client!il",
      name = "c",
      descriptor = "Z"
   )
   private boolean field46 = false;
   @OriginalMember(
      owner = "client!il",
      name = "l",
      descriptor = "J"
   )
   private long field52 = class792.method5708(-25005);
   @OriginalMember(
      owner = "client!il",
      name = "t",
      descriptor = "I"
   )
   private int field53 = 0;
   @OriginalMember(
      owner = "client!il",
      name = "g",
      descriptor = "I"
   )
   private int field58 = 0;
   @OriginalMember(
      owner = "client!il",
      name = "G",
      descriptor = "J"
   )
   private long field61 = 0L;
   @OriginalMember(
      owner = "client!il",
      name = "p",
      descriptor = "[Lfga;"
   )
   private class268[] field60 = new class268[8];
   @OriginalMember(
      owner = "client!il",
      name = "f",
      descriptor = "J"
   )
   private long field54 = 0L;
   @OriginalMember(
      owner = "client!il",
      name = "k",
      descriptor = "Z"
   )
   private boolean field65 = true;
   @OriginalMember(
      owner = "client!il",
      name = "s",
      descriptor = "[Lfga;"
   )
   private class268[] field67 = new class268[8];
   @OriginalMember(
      owner = "client!il",
      name = "x",
      descriptor = "I"
   )
   private int field63 = 0;
   @OriginalMember(
      owner = "client!il",
      name = "C",
      descriptor = "I"
   )
   private int field69 = 0;
   @OriginalMember(
      owner = "client!il",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field70 = new String[]{method63(method62(".t?](")), method63(method62("<6?<}")), method63(method62(";/}\u001f")), method63(method62("<6?0}")), method63(method62("<6?:}")), method63(method62("<6?4}")), method63(method62("<6?5}")), method63(method62("<6??}")), method63(method62("<6?6}")), method63(method62("<6?=}")), method63(method62("<6?8}")), method63(method62("<6?9}")), method63(method62("<6?2}")), method63(method62("<6?;}")), method63(method62("<6?1}")), method63(method62("<6?7}"))};
   @OriginalMember(
      owner = "client!il",
      name = "y",
      descriptor = "Ldd;"
   )
   public static class735 field59 = new class735(6, 0, 4, 2);
   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "I"
   )
   public static int field66 = 0;
   @OriginalMember(
      owner = "client!il",
      name = "v",
      descriptor = "I"
   )
   public static int field37;
   @OriginalMember(
      owner = "client!il",
      name = "D",
      descriptor = "I"
   )
   public static int field38;
   @OriginalMember(
      owner = "client!il",
      name = "n",
      descriptor = "I"
   )
   public static int field39;
   @OriginalMember(
      owner = "client!il",
      name = "h",
      descriptor = "I"
   )
   public static int field41;
   @OriginalMember(
      owner = "client!il",
      name = "u",
      descriptor = "I"
   )
   public static int field42;
   @OriginalMember(
      owner = "client!il",
      name = "E",
      descriptor = "I"
   )
   public static int field43;
   @OriginalMember(
      owner = "client!il",
      name = "i",
      descriptor = "I"
   )
   public static int field45;
   @OriginalMember(
      owner = "client!il",
      name = "w",
      descriptor = "I"
   )
   public static int field48;
   @OriginalMember(
      owner = "client!il",
      name = "F",
      descriptor = "I"
   )
   public static int field49;
   @OriginalMember(
      owner = "client!il",
      name = "m",
      descriptor = "I"
   )
   public static int field50;
   @OriginalMember(
      owner = "client!il",
      name = "q",
      descriptor = "I"
   )
   public static int field51;
   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "I"
   )
   public static int field55;
   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "I"
   )
   public static int field56;
   @OriginalMember(
      owner = "client!il",
      name = "A",
      descriptor = "I"
   )
   public int field57;
   @OriginalMember(
      owner = "client!il",
      name = "d",
      descriptor = "I"
   )
   public int field64;
   @OriginalMember(
      owner = "client!il",
      name = "o",
      descriptor = "I"
   )
   private int field68;
   @OriginalMember(
      owner = "client!il",
      name = "B",
      descriptor = "Lfga;"
   )
   private class268 field44;
   @OriginalMember(
      owner = "client!il",
      name = "j",
      descriptor = "Lil;"
   )
   public static class7 field62;
   @OriginalMember(
      owner = "client!il",
      name = "e",
      descriptor = "[I"
   )
   public int[] field47;

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method47(int arg0, int arg1) {
      try {
         if (arg0 < 94) {
            this.method60((int[])null, -14);
         }

         ++field50;
         this.field53 -= arg1;
         if (this.field53 < 0) {
            this.field53 = 0;
         }

         if (this.field44 != null) {
            this.field44.method684(arg1);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field70[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "()V"
   )
   public void method48() {
      try {
         ++field56;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field70[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "c",
      descriptor = "()V"
   )
   public void method49() throws Exception {
      try {
         ++field51;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field70[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(B)V"
   )
   public final synchronized void method50(byte arg0) {
      try {
         if (arg0 != 40) {
            this.field69 = -82;
         }

         this.field65 = true;
         ++field43;

         try {
            this.method49();
         } catch (Exception var3) {
            this.method48();
            this.field61 = class792.method5708(-25005) - -2000L;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field70[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public void method51(Component arg0) throws Exception {
      try {
         ++field38;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field70[1] + (arg0 != null ? field70[0] : field70[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "c",
      descriptor = "(I)V"
   )
   public void method52(int arg0) throws Exception {
      try {
         ++field49;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field70[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(IIBIIIII)V"
   )
   public static final void method53(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field4273;

      try {
         if (arg2 == -11) {
            ++field39;
            int var9 = -arg1 + arg4;
            int var10 = arg1 + arg5;
            int var11 = arg5;
            if (var8) {
               class125.method1046(arg2 + -23344, arg0, class17.field236[arg5], arg6, arg3);
               var11 = arg5 + 1;
            }

            while(true) {
               while(~var10 < ~var11) {
                  class125.method1046(arg2 + -23344, arg0, class17.field236[var11], arg6, arg3);
                  ++var11;
               }

               int var12 = arg4;
               if (!var8) {
                  if (var8) {
                     class125.method1046(-23355, arg0, class17.field236[arg4], arg6, arg3);
                     var12 = arg4 - 1;
                  }

                  while(true) {
                     while(var12 > var9) {
                        class125.method1046(-23355, arg0, class17.field236[var12], arg6, arg3);
                        --var12;
                     }

                     int var13 = arg3 - -arg1;
                     int var14 = -arg1 + arg0;
                     int var15 = var10;
                     if (!var8) {
                        if (!var8 && ~var9 > ~var10) {
                           return;
                        }

                        do {
                           int[] var16 = class17.field236[var15];
                           class125.method1046(arg2 ^ 23344, var13, var16, arg6, arg3);
                           class125.method1046(-23355, var14, var16, arg7, var13);
                           class125.method1046(-23355, arg0, var16, arg6, var14);
                           ++var15;
                        } while(~var9 <= ~var15);

                        return;
                     }

                     --var12;
                  }
               }

               ++var11;
            }
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field70[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "()I"
   )
   public int method54() throws Exception {
      try {
         ++field37;
         return this.field64;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field70[13] + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "(I)V"
   )
   public final synchronized void method55(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(ILfga;I)V"
   )
   private final void method56(int arg0, class268 arg1, int arg2) {
      try {
         ++field42;
         int var4 = arg2 >> 5;
         if (arg0 >= -35) {
            this.method55(64);
         }

         label26: {
            class268 var5 = this.field60[var4];
            if (var5 != null) {
               var5.field3475 = arg1;
               if (!client.field4273) {
                  break label26;
               }
            }

            this.field67[var4] = arg1;
         }

         this.field60[var4] = arg1;
         arg1.field3473 = arg2;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field70[6] + arg0 + ',' + (arg1 != null ? field70[0] : field70[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "d",
      descriptor = "()V"
   )
   public void method57() throws Exception {
      try {
         ++field41;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field70[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method58(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field55;
         if (class577.field7923 != null) {
            boolean var3 = true;
            int var4 = 0;
            if (var2) {
               if (class577.field7923.field263[var4] == this) {
                  class577.field7923.field263[var4] = null;
               }

               if (class577.field7923.field263[var4] != null) {
                  var3 = false;
               }

               ++var4;
            }

            while(true) {
               while(var4 < 2) {
                  if (class577.field7923.field263[var4] == this) {
                     class577.field7923.field263[var4] = null;
                  }

                  if (class577.field7923.field263[var4] != null) {
                     var3 = false;
                  }

                  ++var4;
               }

               if (!var2) {
                  if (var3) {
                     class577.field7923.field267 = true;
                     if (var2) {
                        class173.method1347(73, 50L);
                     }

                     while(class577.field7923.field266) {
                        class173.method1347(73, 50L);
                     }

                     class577.field7923 = null;
                  }
                  break;
               }

               var3 = var3;
               ++var4;
            }
         }

         this.method48();
         this.field47 = null;
         this.field46 = true;
         if (arg0 != 2) {
            method53(100, 5, (byte)-84, 89, 4, 86, 31, -53);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field70[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method59(byte arg0) {
      try {
         field62 = null;
         if (arg0 != 124) {
            method53(-27, -85, (byte)-122, 116, 79, -119, -68, -5);
         }

         field59 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field70[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "([II)V"
   )
   private final void method60(int[] arg0, int arg1) {
      int var3 = arg1;
      if (class614.field8578) {
         var3 = arg1 << 1;
      }

      class714.method5198(arg0, 0, var3);
      this.field53 -= arg1;
      if (this.field44 != null && this.field53 <= 0) {
         this.field53 += class556.field7644 >> 4;
         class187.method1424(-19896, this.field44);
         this.method56(-127, this.field44, this.field44.method2058());
         int var4 = 0;
         int var5 = 255;
         int var6 = 7;

         label107:
         while(var5 != 0) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  class268 var10 = null;
                  class268 var11 = this.field67[var7];

                  label101:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label101;
                        }

                        class320 var12 = var11.field3476;
                        if (var12 != null && var12.field4281 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field3475;
                        } else {
                           var11.field3474 = true;
                           int var13 = var11.method668();
                           var4 += var13;
                           if (var12 != null) {
                              var12.field4281 += var13;
                           }

                           if (var4 >= this.field40) {
                              break label107;
                           }

                           class268 var14 = var11.method650();
                           if (var14 != null) {
                              int var15 = var11.field3473;

                              while(var14 != null) {
                                 this.method56(-75, var14, var15 * var14.method2058() >> 8);
                                 var14 = var11.method649();
                              }
                           }

                           class268 var16 = var11.field3475;
                           var11.field3475 = null;
                           if (var10 == null) {
                              this.field67[var7] = var16;
                           } else {
                              var10.field3475 = var16;
                           }

                           if (var16 == null) {
                              this.field60[var7] = var10;
                           }

                           var11 = var16;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }

            --var6;
         }

         for(int var17 = 0; var17 < 8; ++var17) {
            class268 var18 = this.field67[var17];
            this.field67[var17] = this.field60[var17] = null;

            while(var18 != null) {
               class268 var19 = var18.field3475;
               var18.field3475 = null;
               var18 = var19;
            }
         }
      }

      if (this.field53 < 0) {
         this.field53 = 0;
      }

      if (this.field44 != null) {
         this.field44.method669(arg0, 0, arg1);
      }

      this.field52 = class792.method5708(-25005);
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(ILfga;)V"
   )
   public final synchronized void method61(int arg0, class268 arg1) {
      try {
         ++field48;
         this.field44 = arg1;
         if (arg0 <= 16) {
            this.field60 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field70[9] + arg0 + ',' + (arg1 != null ? field70[0] : field70[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method62(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method63(char[] arg0) {
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
            var10005 = 90;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
