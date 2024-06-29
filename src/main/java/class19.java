import java.awt.Component;
import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class19 extends class606 {
   @OriginalMember(
      owner = "client!hg",
      name = "Q",
      descriptor = "I"
   )
   private int field249 = 1024;
   @OriginalMember(
      owner = "client!hg",
      name = "L",
      descriptor = "I"
   )
   private int field256 = 3072;
   @OriginalMember(
      owner = "client!hg",
      name = "D",
      descriptor = "I"
   )
   private int field262 = 2048;
   @OriginalMember(
      owner = "client!hg",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field266 = new String[]{method274(method273("^zm>;")), method274(method273("^zm4;")), method274(method273("Xh/\u0019")), method274(method273("M3m[n")), method274(method273("@k")), method274(method273("\\|5\u0014=Wj7[PYp3\u001a}Ss7")), method274(method273("^zm2;")), method274(method273("^zm6;")), method274(method273("Rh.\u0018j")), method274(method273("^zm?;")), method274(method273("^zm=;")), method274(method273("^zm<;")), method274(method273("^zm7;")), method274(method273("^zm0;"))};
   @OriginalMember(
      owner = "client!hg",
      name = "V",
      descriptor = "[S"
   )
   private static short[] field260 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!hg",
      name = "P",
      descriptor = "[S"
   )
   private static short[] field258 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!hg",
      name = "M",
      descriptor = "[S"
   )
   private static short[] field263 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!hg",
      name = "T",
      descriptor = "[[S"
   )
   public static short[][] field264 = new short[][]{field260, field258, field263};
   @OriginalMember(
      owner = "client!hg",
      name = "F",
      descriptor = "I"
   )
   public static int field250;
   @OriginalMember(
      owner = "client!hg",
      name = "N",
      descriptor = "I"
   )
   public static int field251;
   @OriginalMember(
      owner = "client!hg",
      name = "U",
      descriptor = "I"
   )
   public static int field252;
   @OriginalMember(
      owner = "client!hg",
      name = "E",
      descriptor = "I"
   )
   public static int field253;
   @OriginalMember(
      owner = "client!hg",
      name = "K",
      descriptor = "I"
   )
   public static int field254;
   @OriginalMember(
      owner = "client!hg",
      name = "O",
      descriptor = "I"
   )
   public static int field255;
   @OriginalMember(
      owner = "client!hg",
      name = "H",
      descriptor = "I"
   )
   public static int field257;
   @OriginalMember(
      owner = "client!hg",
      name = "I",
      descriptor = "I"
   )
   public static int field259;
   @OriginalMember(
      owner = "client!hg",
      name = "S",
      descriptor = "I"
   )
   public static int field261;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!hg",
      name = "R",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field265;

   @OriginalMember(
      owner = "client!hg",
      name = "f",
      descriptor = "(I)Z"
   )
   public static final boolean method266(int arg0) {
      try {
         ++field250;
         return arg0 <= class394.field5712;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field266[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Ljava/lang/Object;Lfea;B)V"
   )
   public static final void method267(Object arg0, class82 arg1, byte arg2) {
      boolean var3 = client.field10022;

      try {
         ++field261;
         if (arg1.field1264 != null) {
            int var4 = 0;
            if (var3) {
               class97.method968(32353, 1L);
               ++var4;
            }

            Object var10000;
            boolean var10001;
            while(true) {
               if (~var4 <= -51) {
                  try {
                     if (arg2 > -26) {
                        return;
                     }

                     var10000 = arg0;
                     break;
                  } catch (Exception var8) {
                     var10001 = false;
                     return;
                  }
               }

               var10000 = arg1.field1264.peekEvent();
               if (var3) {
                  break;
               }

               if (var10000 == null) {
                  try {
                     if (arg2 > -26) {
                        return;
                     }

                     var10000 = arg0;
                     break;
                  } catch (Exception var7) {
                     var10001 = false;
                     return;
                  }
               }

               class97.method968(32353, 1L);
               ++var4;
            }

            try {
               if (var10000 != null) {
                  arg1.field1264.postEvent(new ActionEvent(arg0, 1001, field266[8]));
               }
            } catch (Exception var6) {
               var10001 = false;
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field266[7] + (arg0 != null ? field266[3] : field266[2]) + ',' + (arg1 != null ? field266[3] : field266[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(ILjava/awt/Component;Z)Les;"
   )
   public static final class592 method268(int arg0, Component arg1, boolean arg2) {
      try {
         ++field254;

         try {
            if (arg0 >= -21) {
               return null;
            } else {
               Constructor var3 = Class.forName(field266[4]).getDeclaredConstructor(field265 != null ? field265 : (field265 = method272(field266[5])), Boolean.TYPE);
               return (class592)var3.newInstance(arg1, new Boolean(arg2));
            }
         } catch (Throwable var5) {
            return new class448(arg1, arg2);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field266[6] + arg0 + ',' + (arg1 != null ? field266[3] : field266[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field255;
         int[][] var4 = super.field8649.method5536(23870, arg1);
         if (arg0 != 373) {
            method269((byte)79);
         }

         if (super.field8649.field11043) {
            int[][] var5 = this.method4467(0, arg1, (byte)92);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || var12 < class563.field8014) {
               do {
                  var9[var12] = this.field249 - -(var6[var12] * this.field262 >> 12);
                  var10[var12] = this.field249 - -(var7[var12] * this.field262 >> 12);
                  var11[var12] = this.field249 - -(var8[var12] * this.field262 >> 12);
                  ++var12;
               } while(var12 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field266[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         ++field253;
         if (arg2 <= -6) {
            if (arg1 != 0) {
               if (~arg1 == -2) {
                  this.field256 = arg0.method685(-2);
                  return;
               }

               if (~arg1 != -3) {
                  return;
               }

               if (!client.field10022) {
                  super.field8641 = arg0.method665(false) == 1;
                  return;
               }
            }

            this.field249 = arg0.method685(-2);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field266[1] + (arg0 != null ? field266[3] : field266[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method269(byte arg0) {
      try {
         field263 = null;
         if (arg0 <= -24) {
            field258 = null;
            field260 = null;
            field264 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field266[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "<init>",
      descriptor = "()V"
   )
   public class19() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         if (arg0 > 118) {
            ++field252;
            this.field262 = -this.field249 + this.field256;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field266[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field10022;

      try {
         ++field259;
         int var9 = class437.method3398(class587.field8239, (byte)-123, arg7, class767.field11011);
         int var10 = class437.method3398(class587.field8239, (byte)99, arg5, class767.field11011);
         int var11 = class437.method3398(class729.field10384, (byte)-110, arg6, class604.field8618);
         int var12 = class437.method3398(class729.field10384, (byte)-73, arg2, class604.field8618);
         int var13 = class437.method3398(class587.field8239, (byte)85, arg3 + arg7, class767.field11011);
         int var14 = class437.method3398(class587.field8239, (byte)-88, -arg3 + arg5, class767.field11011);
         int var15 = var9;
         if (var8) {
            class100.method989(var11, (byte)22, var12, arg0, class788.field11482[var9]);
            var15 = var9 + 1;
         }

         while(true) {
            while(~var15 > ~var13) {
               class100.method989(var11, (byte)22, var12, arg0, class788.field11482[var15]);
               ++var15;
            }

            int var16 = var10;
            if (!var8) {
               if (var8) {
                  class100.method989(var11, (byte)22, var12, arg0, class788.field11482[var10]);
                  var16 = var10 - 1;
               }

               while(true) {
                  while(var14 < var16) {
                     class100.method989(var11, (byte)22, var12, arg0, class788.field11482[var16]);
                     --var16;
                  }

                  int var17 = class437.method3398(class729.field10384, (byte)93, arg3 + arg6, class604.field8618);
                  int var18 = class437.method3398(class729.field10384, (byte)-89, -arg3 + arg2, class604.field8618);
                  int var19 = var13;
                  if (!var8) {
                     if (!var8 && ~var13 < ~var14) {
                        if (arg4 <= 119) {
                           method271(-108, 109, -35, -88, -73, 66, 35, -13);
                           return;
                        }

                        return;
                     }

                     do {
                        int[] var20 = class788.field11482[var19];
                        class100.method989(var11, (byte)22, var17, arg0, var20);
                        class100.method989(var17, (byte)22, var18, arg1, var20);
                        class100.method989(var18, (byte)22, var12, arg0, var20);
                        ++var19;
                     } while(~var19 >= ~var14);

                     if (arg4 <= 119) {
                        method271(-108, 109, -35, -88, -73, 66, 35, -13);
                        return;
                     }

                     return;
                  }

                  --var16;
               }
            }

            ++var15;
         }
      } catch (RuntimeException var22) {
         throw class612.method4503(var22, field266[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field251;
         if (arg0 != 0) {
            field263 = null;
         }

         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            int[] var5 = this.method4463(arg1, arg0 + 13064, 0);
            int var6 = 0;
            if (var3 || ~class563.field8014 < ~var6) {
               do {
                  var4[var6] = (var5[var6] * this.field262 >> 12) + this.field249;
                  ++var6;
               } while(~class563.field8014 < ~var6);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field266[10] + arg0 + ',' + arg1 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method272(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method273(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method274(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
