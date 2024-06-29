import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class468 {
   @OriginalMember(
      owner = "client!nj",
      name = "q",
      descriptor = "Z"
   )
   private boolean field6441 = true;
   @OriginalMember(
      owner = "client!nj",
      name = "n",
      descriptor = "I"
   )
   private int field6437 = -1;
   @OriginalMember(
      owner = "client!nj",
      name = "h",
      descriptor = "I"
   )
   private int field6427;
   @OriginalMember(
      owner = "client!nj",
      name = "k",
      descriptor = "I"
   )
   private int field6430;
   @OriginalMember(
      owner = "client!nj",
      name = "r",
      descriptor = "I"
   )
   private int field6442;
   @OriginalMember(
      owner = "client!nj",
      name = "e",
      descriptor = "I"
   )
   private int field6443;
   @OriginalMember(
      owner = "client!nj",
      name = "j",
      descriptor = "[Lfp;"
   )
   private class599[] field6439;
   @OriginalMember(
      owner = "client!nj",
      name = "i",
      descriptor = "Lfp;"
   )
   private class599 field6431;
   @OriginalMember(
      owner = "client!nj",
      name = "g",
      descriptor = "[Lfp;"
   )
   private class599[] field6444;
   @OriginalMember(
      owner = "client!nj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6445 = new String[]{method3562(method3561("Q?y_=pw{T5r>t^xd6qW=fm")), method3562(method3561("yy6\u0015%")), method3562(method3561("l\"tW")), method3562(method3561("l=6zp")), method3562(method3561("l=6\u00071l>l\u0005p")), method3562(method3561("l=6yp")), method3562(method3561("l=6~p")), method3562(method3561("l=6xp")), method3562(method3561("l=6\u007fp"))};
   @OriginalMember(
      owner = "client!nj",
      name = "p",
      descriptor = "I"
   )
   public static int field6438 = 0;
   @OriginalMember(
      owner = "client!nj",
      name = "l",
      descriptor = "I"
   )
   public static int field6426;
   @OriginalMember(
      owner = "client!nj",
      name = "f",
      descriptor = "I"
   )
   private int field6428;
   @OriginalMember(
      owner = "client!nj",
      name = "m",
      descriptor = "I"
   )
   public static int field6429;
   @OriginalMember(
      owner = "client!nj",
      name = "s",
      descriptor = "I"
   )
   public static int field6432;
   @OriginalMember(
      owner = "client!nj",
      name = "d",
      descriptor = "I"
   )
   public static int field6433;
   @OriginalMember(
      owner = "client!nj",
      name = "c",
      descriptor = "I"
   )
   private int field6434;
   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "I"
   )
   public static int field6436;
   @OriginalMember(
      owner = "client!nj",
      name = "o",
      descriptor = "I"
   )
   public static int field6440;
   @OriginalMember(
      owner = "client!nj",
      name = "b",
      descriptor = "Lpd;"
   )
   private class648 field6435;

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(ILha;I)Z"
   )
   public final boolean method3556(int arg0, class479 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         ++field6440;
         if (~this.field6437 != ~arg2) {
            this.field6437 = arg2;
            int var5 = class634.method4671(arg2, (byte)35);
            if (var5 > 512) {
               var5 = 512;
            }

            if (var5 <= 0) {
               var5 = 1;
            }

            if (~this.field6428 != ~var5) {
               this.field6428 = var5;
               this.field6435 = null;
            }

            if (this.field6439 != null) {
               label94: {
                  this.field6434 = 0;
                  int[] var6 = new int[this.field6439.length];
                  int var7 = 0;
                  class599[] var10000;
                  if (var4) {
                     var10000 = this.field6439;
                  } else if (~this.field6439.length >= ~var7) {
                     var10000 = this.field6444;
                     if (!var4) {
                        class573.method4298(var10000, var6, this.field6434 + -1, 0, (byte)-126);
                        break label94;
                     }
                  } else {
                     var10000 = this.field6439;
                  }

                  while(true) {
                     class599 var8 = var10000[var7];
                     if (var8.method4460(this.field6442, this.field6430, this.field6427, this.field6437)) {
                        var6[this.field6434] = var8.field8847;
                        this.field6444[this.field6434++] = var8;
                     }

                     ++var7;
                     if (~this.field6439.length >= ~var7) {
                        var10000 = this.field6444;
                        if (!var4) {
                           class573.method4298(var10000, var6, this.field6434 + -1, 0, (byte)-126);
                           break;
                        }
                     } else {
                        var10000 = this.field6439;
                     }
                  }
               }
            }

            this.field6441 = true;
         }

         int var9 = 69 / ((arg0 - -67) / 40);
         boolean var10 = false;
         if (this.field6441) {
            this.field6441 = false;
            int var11 = this.field6434 + -1;
            if (var4 || var11 >= 0) {
               do {
                  boolean var12 = this.field6444[var11].method4454(arg1, this.field6431);
                  var10 |= var12;
                  this.field6441 |= !var12;
                  --var11;
               } while(var11 >= 0);
            }
         }

         return var10;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field6445[8] + arg0 + ',' + (arg1 != null ? field6445[1] : field6445[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(Liu;ILjava/lang/String;I)Llj;"
   )
   public static final class8 method3557(class530 arg0, int arg1, String arg2, int arg3) {
      try {
         ++field6432;
         long var4 = OpenGL.glCreateShaderObjectARB(arg3);
         if (arg1 != 2) {
            return null;
         } else {
            OpenGL.glShaderSourceARB(var4, arg2);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class454.field6261, 0);
            if (class454.field6261[0] == 0) {
               if (~class454.field6261[0] == -1) {
                  System.out.println(field6445[0]);
               }

               OpenGL.glGetObjectParameterivARB(var4, 35716, class454.field6261, 1);
               if (class454.field6261[1] > 1) {
                  byte[] var6 = new byte[class454.field6261[1]];
                  OpenGL.glGetInfoLogARB(var4, class454.field6261[1], class454.field6261, 0, var6, 0);
                  System.out.println(new String(var6));
               }

               if (class454.field6261[0] == 0) {
                  OpenGL.glDeleteObjectARB(var4);
                  return null;
               }
            }

            return new class8(arg0, var4, arg3);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6445[3] + (arg0 != null ? field6445[1] : field6445[2]) + ',' + arg1 + ',' + (arg2 != null ? field6445[1] : field6445[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3558(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field6436;
         if (this.field6439 != null) {
            int var3 = 0;
            if (var2 || var3 < this.field6439.length) {
               do {
                  this.field6439[var3].method4458();
                  ++var3;
               } while(var3 < this.field6439.length);
            }
         }

         this.field6435 = null;
         if (arg0 != -25) {
            this.field6427 = -76;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6445[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method3559(int arg0, int arg1, int arg2) {
      try {
         ++field6429;
         if (arg2 == -1) {
            return 12345678;
         } else {
            arg0 = (arg2 & 127) * arg0 >> 7;
            if (~arg0 <= -3) {
               if (arg0 <= 126) {
                  return arg1 != -1973105145 ? 89 : (arg2 & 65408) + arg0;
               }

               arg0 = 126;
               if (!client.field1481) {
                  return arg1 != -1973105145 ? 89 : (arg2 & 65408) + arg0;
               }
            }

            arg0 = 2;
            return arg1 != -1973105145 ? 89 : (arg2 & 65408) + arg0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6445[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(IILha;IIIIIII)V"
   )
   public final void method3560(int param1, int param2, class479 param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nj",
      name = "<init>",
      descriptor = "(I[Lfp;IIII)V"
   )
   public class468(int arg0, class599[] arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field6427 = arg5;
         this.field6430 = arg4;
         this.field6442 = arg3;
         this.field6443 = arg0;
         this.field6439 = arg1;
         if (arg1 == null) {
            this.field6431 = null;
            this.field6444 = null;
         } else {
            this.field6444 = new class599[arg1.length];
            this.field6431 = ~arg2 <= -1 ? arg1[arg2] : null;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6445[4] + arg0 + ',' + (arg1 != null ? field6445[1] : field6445[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3561(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3562(char[] arg0) {
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
            var10005 = 87;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
