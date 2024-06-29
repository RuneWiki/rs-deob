import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class415 {
   @OriginalMember(
      owner = "client!hf",
      name = "e",
      descriptor = "I"
   )
   private int field6353 = -1;
   @OriginalMember(
      owner = "client!hf",
      name = "n",
      descriptor = "I"
   )
   private int field6350 = 0;
   @OriginalMember(
      owner = "client!hf",
      name = "h",
      descriptor = "Lum;"
   )
   private class550 field6347 = new class550();
   @OriginalMember(
      owner = "client!hf",
      name = "j",
      descriptor = "Z"
   )
   public boolean field6356 = false;
   @OriginalMember(
      owner = "client!hf",
      name = "f",
      descriptor = "I"
   )
   private int field6344;
   @OriginalMember(
      owner = "client!hf",
      name = "i",
      descriptor = "I"
   )
   private int field6354;
   @OriginalMember(
      owner = "client!hf",
      name = "b",
      descriptor = "[[I"
   )
   private int[][] field6345;
   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "[Lgo;"
   )
   private class653[] field6351;
   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6357 = new String[]{method3178(method3177("~\u007fb\u0005\u007f")), method3178(method3177("~\u007fb\u0000\u007f")), method3178(method3177("~\u007fb\u007f>xp8}\u007f")), method3178(method3177("Ux\"c8xu5c%sm>*2`|l\"wpl /w\u007ft-$26z- ?s")), method3178(method3177("~\u007fb\u0007\u007f")), method3178(method3177("~\u007fb\u0006\u007f")), method3178(method3177("~\u007fb\u0002\u007f")), method3178(method3177("~\u007fb\u0001\u007f"))};
   @OriginalMember(
      owner = "client!hf",
      name = "k",
      descriptor = "I"
   )
   public static int field6343;
   @OriginalMember(
      owner = "client!hf",
      name = "d",
      descriptor = "I"
   )
   public static int field6346;
   @OriginalMember(
      owner = "client!hf",
      name = "m",
      descriptor = "I"
   )
   public static int field6348;
   @OriginalMember(
      owner = "client!hf",
      name = "c",
      descriptor = "I"
   )
   public static int field6349;
   @OriginalMember(
      owner = "client!hf",
      name = "l",
      descriptor = "I"
   )
   public static int field6352;
   @OriginalMember(
      owner = "client!hf",
      name = "g",
      descriptor = "I"
   )
   public static int field6355;

   @OriginalMember(
      owner = "client!hf",
      name = "b",
      descriptor = "(I)V",
      line = 11
   )
   public final void method3171(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(I)V",
      line = 32
   )
   public static final void method3172(int arg0) {
      int var1 = client.field4530;

      try {
         ++field6352;
         if (class628.field9136 == null) {
            int var2 = class562.field8401;
            int var3 = class787.field11447;
            int var4 = class88.field1075 - var2 + -class207.field2647;
            int var5 = -class411.field6305 + class332.field4758 - var3;
            if (~var2 < arg0 || ~var4 < -1 || var3 > 0 || var5 > 0) {
               try {
                  Container var6;
                  label53: {
                     if (class691.field10404 == null) {
                        if (class238.field3003 != null) {
                           var6 = class238.field3003;
                           if (var1 == 0) {
                              break label53;
                           }
                        }

                        var6 = class754.field11141;
                        if (var1 == 0) {
                           break label53;
                        }
                     }

                     var6 = class691.field10404;
                  }

                  int var7 = 0;
                  int var8 = 0;
                  if (class691.field10404 == var6) {
                     Insets var9 = class691.field10404.getInsets();
                     var7 = var9.left;
                     var8 = var9.top;
                  }

                  Graphics var10 = var6.getGraphics();
                  var10.setColor(Color.black);
                  if (var2 > 0) {
                     var10.fillRect(var7, var8, var2, class332.field4758);
                  }

                  if (~var3 < -1) {
                     var10.fillRect(var7, var8, class88.field1075, var3);
                  }

                  if (var4 > 0) {
                     var10.fillRect(var7 - (-class88.field1075 + var4), var8, var4, class332.field4758);
                  }

                  if (~var5 < -1) {
                     var10.fillRect(var7, class332.field4758 + var8 + -var5, class88.field1075, var5);
                     return;
                  }
               } catch (Exception var12) {
                  return;
               }
            }

         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6357[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(III)Z",
      line = 98
   )
   public static final boolean method3173(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 10695) {
            method3174(43, -56, 96, (byte)57, -21, true, 30);
         }

         ++field6348;
         return (arg0 & 544) == 544 | ~(24 & arg0) != -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6357[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(IIIBIZI)V",
      line = 113
   )
   public static final void method3174(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
      try {
         if (arg3 == -116) {
            ++field6343;
            if (~(arg5 ? class261.field3566.field9469.method1271(arg3 ^ -22) : class261.field3566.field9430.method1271(127)) != -1 && arg6 != 0 && ~class130.field1612 > -51 && ~arg1 != 0) {
               class321.field4575[class130.field1612++] = new class581((byte)(!arg5 ? 2 : 3), arg1, arg6, arg2, arg0, 0, arg4, (class616)null);
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6357[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(IB)[I",
      line = 131
   )
   public final int[] method3175(int arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 != -127) {
            this.field6351 = null;
         }

         ++field6349;
         if (~this.field6354 != ~this.field6344) {
            if (this.field6344 == 1) {
               this.field6356 = this.field6353 != arg0;
               this.field6353 = arg0;
               return this.field6345[0];
            } else {
               class653 var4;
               label54: {
                  var4 = this.field6351[arg0];
                  if (var4 != null) {
                     this.field6356 = false;
                     if (var3 == 0) {
                        break label54;
                     }
                  }

                  label39: {
                     this.field6356 = true;
                     if (~this.field6344 < ~this.field6350) {
                        var4 = new class653(arg0, this.field6350);
                        ++this.field6350;
                        if (var3 == 0) {
                           break label39;
                        }
                     }

                     class653 var5 = (class653)this.field6347.method4061(false);
                     var4 = new class653(arg0, var5.field9511);
                     this.field6351[var5.field9509] = null;
                     var5.method2720(arg1 + 127);
                  }

                  this.field6351[arg0] = var4;
               }

               this.field6347.method4070(var4, (byte)50);
               return this.field6345[var4.field9511];
            }
         } else {
            this.field6356 = this.field6351[arg0] == null;
            this.field6351[arg0] = class447.field6794;
            return this.field6345[arg0];
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6357[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "c",
      descriptor = "(I)[[I",
      line = 201
   )
   public final int[][] method3176(int arg0) {
      int var2 = client.field4530;

      try {
         ++field6346;
         if (this.field6354 != this.field6344) {
            throw new RuntimeException(field6357[3]);
         } else {
            if (arg0 != -1) {
               method3172(2);
            }

            int var3 = 0;
            if (var2 != 0) {
               this.field6351[var3] = class447.field6794;
               ++var3;
            }

            while(true) {
               class415 var10000;
               if (~this.field6344 >= ~var3) {
                  var10000 = this;
                  if (var2 == 0) {
                     return this.field6345;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field6351[var3] = class447.field6794;
               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6357[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "<init>",
      descriptor = "(III)V",
      line = 241
   )
   public class415(int arg0, int arg1, int arg2) {
      try {
         this.field6344 = arg0;
         this.field6354 = arg1;
         this.field6345 = new int[this.field6344][arg2];
         this.field6351 = new class653[this.field6354];
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6357[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3177(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3178(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
