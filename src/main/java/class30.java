import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class30 {
   @OriginalMember(
      owner = "client!uc",
      name = "k",
      descriptor = "Z"
   )
   private boolean field469;
   @OriginalMember(
      owner = "client!uc",
      name = "f",
      descriptor = "I"
   )
   private int field463;
   @OriginalMember(
      owner = "client!uc",
      name = "i",
      descriptor = "Lrk;"
   )
   public class35 field461;
   @OriginalMember(
      owner = "client!uc",
      name = "g",
      descriptor = "I"
   )
   private int field465;
   @OriginalMember(
      owner = "client!uc",
      name = "b",
      descriptor = "I"
   )
   public int field468;
   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field472 = new String[]{method227(method226("_$\u001d!1")), method227(method226("J\u007f_c")), method227(method226("Qi\u001d3%JcG1d")), method227(method226("Qi\u001dBd")), method227(method226("Qi\u001d_d")), method227(method226("Qi\u001dDd")), method227(method226("Qi\u001dCd")), method227(method226("Qi\u001di%Jk_f6A\"")), method227(method226("Qi\u001dAd"))};
   @OriginalMember(
      owner = "client!uc",
      name = "j",
      descriptor = "Lgh;"
   )
   public static class572 field470 = new class572(76, 10);
   @OriginalMember(
      owner = "client!uc",
      name = "d",
      descriptor = "I"
   )
   public static int field460;
   @OriginalMember(
      owner = "client!uc",
      name = "l",
      descriptor = "I"
   )
   public static int field462;
   @OriginalMember(
      owner = "client!uc",
      name = "c",
      descriptor = "I"
   )
   public static int field464;
   @OriginalMember(
      owner = "client!uc",
      name = "h",
      descriptor = "I"
   )
   public static int field466;
   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "I"
   )
   public static int field467;
   @OriginalMember(
      owner = "client!uc",
      name = "e",
      descriptor = "Ljfa;"
   )
   public static class303 field471;

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(II[B)V"
   )
   public final void method219(int arg0, int arg1, byte[] arg2) {
      try {
         ++field464;
         if (arg0 != 35040) {
            this.field468 = -28;
         }

         this.method225((byte)45);
         if (arg1 > this.field465) {
            OpenGL.glBufferDataARBub(this.field463, arg1, arg2, 0, this.field469 ? 35040 : 35044);
            this.field461.field742 += arg1 - this.field465;
            this.field465 = arg1;
         } else {
            OpenGL.glBufferSubDataARBub(this.field463, 0, arg1, arg2, 0);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field472[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field472[0] : field472[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method220(int arg0, String arg1) {
      boolean var2 = client.field4564;

      try {
         ++field466;
         if (arg1 == null) {
            return -1;
         } else if (arg0 != 6962) {
            return -50;
         } else {
            int var3 = 0;
            if (var2) {
               if (arg1.equalsIgnoreCase(class670.field9809[var3])) {
                  return var3;
               }

               ++var3;
            }

            while(true) {
               while(var3 < class128.field2146) {
                  if (arg1.equalsIgnoreCase(class670.field9809[var3])) {
                     return var3;
                  }

                  ++var3;
               }

               if (!var2) {
                  return -1;
               }

               if (-1 != 0) {
                  return var3;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field472[4] + arg0 + ',' + (arg1 != null ? field472[0] : field472[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(BIIIII)V"
   )
   public static final void method221(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field460;
         if (arg3 == arg4) {
            class743.method5392(arg1, arg5, arg2, arg4, -1413);
         } else if (arg0 >= 15) {
            if (~class515.field7502 >= ~(arg2 - arg4) && ~class130.field2163 <= ~(arg2 + arg4) && class3.field16 <= arg1 - arg3 && arg1 + arg3 <= class581.field8354) {
               class49.method607(arg2, arg3, arg4, arg1, 30221, arg5);
            } else {
               class453.method3412(arg5, arg1, 1184079329, arg3, arg2, arg4);
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field472[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field462;
         this.field461.method420(1, this.field465, this.field468);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field472[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "([BI)[B"
   )
   public static final byte[] method222(byte[] arg0, int arg1) {
      try {
         ++field467;
         if (arg0 == null) {
            return null;
         } else {
            byte[] var2 = new byte[arg0.length];
            if (arg1 != -2673) {
               field471 = null;
            }

            class365.method2856(arg0, 0, var2, 0, arg0.length);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field472[5] + (arg0 != null ? field472[0] : field472[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method223(int arg0) {
      try {
         field471 = null;
         field470 = null;
         if (arg0 != 1) {
            method222((byte[])null, 48);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field472[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(Lvca;IIIII)V"
   )
   public static final void method224(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = true;
      int var7 = arg2;
      int var8 = arg2 + arg4;
      int var9 = arg3 - 1;
      int var10 = arg3 + arg5;

      for(int var11 = arg1; var11 <= arg1 + 1; ++var11) {
         if (class323.field4655 != var11) {
            for(int var12 = var7; var12 <= var8; ++var12) {
               if (var12 >= 0 && var12 < class479.field6989) {
                  for(int var13 = var9; var13 <= var10; ++var13) {
                     if (var13 >= 0 && var13 < class357.field5100 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                        class600 var14 = class90.field1473[var11][var12][var13];
                        if (var14 != null) {
                           int var15 = (class269.field3810[var11].method2289(var12, var13, (byte)120) + class269.field3810[var11].method2289(var12 + 1, var13, (byte)115) + class269.field3810[var11].method2289(var12, var13 + 1, (byte)125) + class269.field3810[var11].method2289(var12 + 1, var13 + 1, (byte)115)) / 4 - (class269.field3810[arg1].method2289(arg2, arg3, (byte)124) + class269.field3810[arg1].method2289(arg2 + 1, arg3, (byte)124) + class269.field3810[arg1].method2289(arg2, arg3 + 1, (byte)109) + class269.field3810[arg1].method2289(arg2 + 1, arg3 + 1, (byte)124)) / 4;
                           class496 var16 = var14.field8659;
                           class496 var17 = var14.field8661;
                           if (var16 != null && var16.method601(0)) {
                              arg0.method579((var12 - arg2) * class57.field1124 + (1 - arg4) * class760.field11026, var6, var16, class49.field1047, (var13 - arg3) * class57.field1124 + (1 - arg5) * class760.field11026, 0, var15);
                           }

                           if (var17 != null && var17.method601(0)) {
                              arg0.method579((var12 - arg2) * class57.field1124 + (1 - arg4) * class760.field11026, var6, var17, class49.field1047, (var13 - arg3) * class57.field1124 + (1 - arg5) * class760.field11026, 0, var15);
                           }

                           for(class533 var18 = var14.field8653; var18 != null; var18 = var18.field7763) {
                              class144 var19 = var18.field7766;
                              if (var19 != null && var19.method601(0) && (var19.field2354 == var12 || var7 == var12) && (var19.field2347 == var13 || var9 == var13)) {
                                 int var20 = var19.field2356 - var19.field2354 + 1;
                                 int var21 = var19.field2348 - var19.field2347 + 1;
                                 arg0.method579((var19.field2354 - arg2) * class57.field1124 + (var20 - arg4) * class760.field11026, var6, var19, class49.field1047, (var19.field2347 - arg3) * class57.field1124 + (var21 - arg5) * class760.field11026, 0, var15);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var7;
            var6 = false;
         }
      }

   }

   @OriginalMember(
      owner = "client!uc",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method225(byte arg0);

   @OriginalMember(
      owner = "client!uc",
      name = "<init>",
      descriptor = "(Lrk;I[BIZ)V"
   )
   public class30(class35 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      try {
         this.field469 = arg4;
         this.field463 = arg1;
         this.field461 = arg0;
         this.field465 = arg3;
         OpenGL.glGenBuffersARB(1, class118.field1933, 0);
         this.field468 = class118.field1933[0];
         this.method225((byte)45);
         OpenGL.glBufferDataARBub(arg1, this.field465, arg2, 0, this.field469 ? 35040 : 35044);
         this.field461.field742 += this.field465;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field472[2] + (arg0 != null ? field472[0] : field472[1]) + ',' + arg1 + ',' + (arg2 != null ? field472[0] : field472[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "<init>",
      descriptor = "(Lrk;ILjaclib/memory/Buffer;IZ)V"
   )
   public class30(class35 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      try {
         this.field469 = arg4;
         this.field461 = arg0;
         this.field463 = arg1;
         this.field465 = arg3;
         OpenGL.glGenBuffersARB(1, class118.field1933, 0);
         this.field468 = class118.field1933[0];
         this.method225((byte)45);
         OpenGL.glBufferDataARBa(arg1, this.field465, arg2.getAddress(), this.field469 ? 35040 : 35044);
         this.field461.field742 += this.field465;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field472[2] + (arg0 != null ? field472[0] : field472[1]) + ',' + arg1 + ',' + (arg2 != null ? field472[0] : field472[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method226(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method227(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
