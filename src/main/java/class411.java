import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class411 {
   @OriginalMember(
      owner = "client!kda",
      name = "j",
      descriptor = "Lql;"
   )
   private class770 field5781 = new class770();
   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5794 = new String[]{method3121(method3120(">\u0013F>L}")), method3121(method3120(">\u0013F>C}")), method3121(method3120(">\u0013F>B}")), method3121(method3120(">\u0013F>A}")), method3121(method3120(">\u0013F>O}")), method3121(method3120(">\u0013F>G}")), method3121(method3120(">\u0013F>@}")), method3121(method3120(".Y\t>y")), method3121(method3120(">\u0013F>M}")), method3121(method3120(";\u0002K|")), method3121(method3120(">\u0013F>8<\u0019Nd:}")), method3121(method3120(">\u0013F>N}")), method3121(method3120(">\u0013F>E}"))};
   @OriginalMember(
      owner = "client!kda",
      name = "k",
      descriptor = "Lbga;"
   )
   public static class378 field5780 = new class378(127, 7);
   @OriginalMember(
      owner = "client!kda",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field5793 = false;
   @OriginalMember(
      owner = "client!kda",
      name = "e",
      descriptor = "F"
   )
   public static float field5791;
   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "I"
   )
   public static int field5782;
   @OriginalMember(
      owner = "client!kda",
      name = "l",
      descriptor = "I"
   )
   public static int field5783;
   @OriginalMember(
      owner = "client!kda",
      name = "m",
      descriptor = "I"
   )
   public static int field5784;
   @OriginalMember(
      owner = "client!kda",
      name = "n",
      descriptor = "I"
   )
   public static int field5786;
   @OriginalMember(
      owner = "client!kda",
      name = "i",
      descriptor = "I"
   )
   public static int field5787;
   @OriginalMember(
      owner = "client!kda",
      name = "f",
      descriptor = "I"
   )
   public static int field5788;
   @OriginalMember(
      owner = "client!kda",
      name = "g",
      descriptor = "I"
   )
   public static int field5789;
   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "I"
   )
   public static int field5790;
   @OriginalMember(
      owner = "client!kda",
      name = "h",
      descriptor = "I"
   )
   public static int field5792;
   @OriginalMember(
      owner = "client!kda",
      name = "c",
      descriptor = "Lql;"
   )
   private class770 field5785;

   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "(B)Lql;"
   )
   public final class770 method3109(byte arg0) {
      try {
         ++field5790;
         class770 var2 = this.field5781.field11090;
         if (arg0 != -87) {
            this.field5781 = null;
         }

         if (this.field5781 == var2) {
            this.field5785 = null;
            return null;
         } else {
            this.field5785 = var2.field11090;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5794[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "(I)Lql;"
   )
   public final class770 method3110(int arg0) {
      try {
         ++field5789;
         class770 var2 = this.field5781.field11092;
         if (arg0 > -92) {
            this.field5781 = null;
         }

         if (this.field5781 == var2) {
            this.field5785 = null;
            return null;
         } else {
            this.field5785 = var2.field11092;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5794[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method3111(boolean arg0) {
      boolean var2 = client.field4273;

      try {
         ++field5783;
         if (!arg0) {
            method3112((byte)-51);
         }

         int var3 = 0;
         class770 var4 = this.field5781.field11092;
         if (var2) {
            ++var3;
            var4 = var4.field11092;
         }

         while(true) {
            if (this.field5781 == var4) {
               if (!var2) {
                  return var3;
               }
            } else {
               ++var3;
            }

            var4 = var4.field11092;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5794[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3112(byte arg0) {
      try {
         field5780 = null;
         int var1 = 70 % ((arg0 - 65) / 58);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5794[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3113(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field5792;
         if (arg0 > 95) {
            while(true) {
               class770 var3 = this.field5781.field11092;
               if (this.field5781 != var3) {
                  var3.method5512((byte)34);
                  if (var2) {
                     break;
                  }

                  if (!var2) {
                     continue;
                  }
               }

               this.field5785 = null;
               break;
            }

         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5794[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(I)Lql;"
   )
   public final class770 method3114(int arg0) {
      try {
         if (arg0 != 2) {
            this.field5785 = null;
         }

         ++field5787;
         class770 var2 = this.field5785;
         if (this.field5781 == var2) {
            this.field5785 = null;
            return null;
         } else {
            this.field5785 = var2.field11092;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5794[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "<init>",
      descriptor = "()V"
   )
   public class411() {
      try {
         this.field5781.field11090 = this.field5781;
         this.field5781.field11092 = this.field5781;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5794[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method3115(boolean arg0) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field5786;
            return this.field5781.field11092 == this.field5781;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5794[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(Lql;I)V"
   )
   public final void method3116(class770 arg0, int arg1) {
      try {
         int var3 = 49 % ((arg1 - -32) / 39);
         ++field5784;
         if (arg0.field11090 != null) {
            arg0.method5512((byte)74);
         }

         arg0.field11090 = this.field5781.field11090;
         arg0.field11092 = this.field5781;
         arg0.field11090.field11092 = arg0;
         arg0.field11092.field11090 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5794[12] + (arg0 != null ? field5794[7] : field5794[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "([BB)V"
   )
   public static final void method3117(byte[] arg0, byte arg1) {
      boolean var2 = client.field4273;

      try {
         ++field5788;
         class594 var3 = new class594(arg0);

         label107:
         while(true) {
            int var4 = var3.method4288((byte)75);
            if (var4 == 0 && !var2) {
               break;
            }

            if (var4 == 1) {
               int[] var5 = class472.field6556 = new int[6];
               var5[0] = var3.method4280(-19104);
               var5[1] = var3.method4280(arg1 + -19174);
               var5[2] = var3.method4280(arg1 + -19174);
               var5[3] = var3.method4280(arg1 + -19174);
               var5[4] = var3.method4280(-19104);
               var5[5] = var3.method4280(-19104);
               if (!var2) {
                  continue;
               }
            }

            int var8;
            int var9;
            do {
               if (~var4 == -5) {
                  int var6 = var3.method4288((byte)108);
                  class710.field10425 = new int[var6];
                  int var7 = 0;
                  if (var2) {
                     class710.field10425[var7] = var3.method4280(-19104);
                     if (class710.field10425[var7] == 65535) {
                        class710.field10425[var7] = -1;
                     }

                     ++var7;
                  }

                  while(true) {
                     if (var7 >= var6) {
                        if (!var2) {
                           if (!var2) {
                              continue label107;
                           }
                           break;
                        }
                     } else {
                        class710.field10425[var7] = var3.method4280(-19104);
                     }

                     if (class710.field10425[var7] == 65535) {
                        class710.field10425[var7] = -1;
                     }

                     ++var7;
                  }
               }

               if (var4 != 5) {
                  continue label107;
               }

               var8 = var3.method4288((byte)69);
               class622.field8691 = new int[var8];
               var9 = 0;
            } while(var2);

            if (var2) {
               class622.field8691[var9] = var3.method4280(-19104);
               if (~class622.field8691[var9] == -65536) {
                  class622.field8691[var9] = -1;
               }

               ++var9;
            }

            while(true) {
               if (var9 >= var8) {
                  if (!var2) {
                     if (var2) {
                        break label107;
                     }
                     break;
                  }
               } else {
                  class622.field8691[var9] = var3.method4280(-19104);
               }

               if (~class622.field8691[var9] == -65536) {
                  class622.field8691[var9] = -1;
               }

               ++var9;
            }
         }

         if (arg1 != 70) {
            field5793 = true;
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field5794[8] + (arg0 != null ? field5794[7] : field5794[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "()V"
   )
   public static final void method3118() {
      class540.method3903(1, class398.field5594);
   }

   @OriginalMember(
      owner = "client!kda",
      name = "d",
      descriptor = "(I)Lql;"
   )
   public final class770 method3119(int arg0) {
      try {
         ++field5782;
         class770 var2 = this.field5781.field11092;
         if (this.field5781 == var2) {
            return null;
         } else {
            if (arg0 != 65535) {
               this.method3114(-111);
            }

            var2.method5512((byte)92);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5794[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3120(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3121(char[] arg0) {
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
            var10005 = 119;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
