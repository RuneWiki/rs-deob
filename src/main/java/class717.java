import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class717 implements Runnable {
   @OriginalMember(
      owner = "client!uu",
      name = "i",
      descriptor = "I"
   )
   private int field10751 = 0;
   @OriginalMember(
      owner = "client!uu",
      name = "r",
      descriptor = "I"
   )
   private int field10756 = 0;
   @OriginalMember(
      owner = "client!uu",
      name = "n",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field10750;
   @OriginalMember(
      owner = "client!uu",
      name = "q",
      descriptor = "I"
   )
   private int field10752;
   @OriginalMember(
      owner = "client!uu",
      name = "v",
      descriptor = "[B"
   )
   private byte[] field10749;
   @OriginalMember(
      owner = "client!uu",
      name = "p",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field10738;
   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10758 = new String[]{method5313(method5312("\u0002Z\\\u0015j")), method5313(method5312("\u0002Z\\o+\u0019F\u0006mj")), method5313(method5312("\u0019Z\u001e?")), method5313(method5312("\f\u0001\\}?")), method5313(method5312("\u0002Z\\!7\u0019\u0007")), method5313(method5312("\u0002Z\\\u0016j")), method5313(method5312("\u0002Z\\\u0014j")), method5313(method5312("\u0002Z\\\u0012j")), method5313(method5312("\u0002Z\\\u0017j")), method5313(method5312("\u0002Z\\\u0010j")), method5313(method5312("\u0002Z\\\u0011j"))};
   @OriginalMember(
      owner = "client!uu",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field10744 = false;
   @OriginalMember(
      owner = "client!uu",
      name = "f",
      descriptor = "[J"
   )
   public static long[] field10745 = new long[256];
   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "I"
   )
   public static int field10736 = 0;
   @OriginalMember(
      owner = "client!uu",
      name = "c",
      descriptor = "[S"
   )
   public static short[] field10742 = new short[256];
   @OriginalMember(
      owner = "client!uu",
      name = "u",
      descriptor = "Z"
   )
   public static boolean field10757;
   @OriginalMember(
      owner = "client!uu",
      name = "e",
      descriptor = "I"
   )
   public static int field10737;
   @OriginalMember(
      owner = "client!uu",
      name = "b",
      descriptor = "I"
   )
   public static int field10740;
   @OriginalMember(
      owner = "client!uu",
      name = "t",
      descriptor = "I"
   )
   public static int field10741;
   @OriginalMember(
      owner = "client!uu",
      name = "l",
      descriptor = "I"
   )
   public static int field10743;
   @OriginalMember(
      owner = "client!uu",
      name = "d",
      descriptor = "I"
   )
   public static int field10746;
   @OriginalMember(
      owner = "client!uu",
      name = "j",
      descriptor = "I"
   )
   public static int field10747;
   @OriginalMember(
      owner = "client!uu",
      name = "k",
      descriptor = "I"
   )
   public static int field10748;
   @OriginalMember(
      owner = "client!uu",
      name = "m",
      descriptor = "I"
   )
   public static int field10753;
   @OriginalMember(
      owner = "client!uu",
      name = "s",
      descriptor = "Lkf;"
   )
   public static class401 field10754;
   @OriginalMember(
      owner = "client!uu",
      name = "o",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field10739;
   @OriginalMember(
      owner = "client!uu",
      name = "g",
      descriptor = "[[Z"
   )
   public static boolean[][] field10755;

   static {
      for(int var0 = 0; ~var0 > -257; ++var0) {
         long var1 = (long)var0;

         for(int var3 = 0; ~var3 > -9; ++var3) {
            if (~(1L & var1) != -2L) {
               var1 >>>= 1;
            } else {
               var1 = var1 >>> 1 ^ -3932672073523589310L;
            }
         }

         field10745[var0] = var1;
      }

      field10757 = false;
   }

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public static final void method5305(int arg0) {
      try {
         ++field10753;
         class97.method952((byte)122);
         if (arg0 != -1) {
            method5310((byte)-63, (class9)null);
         }

         class400.method3232(-8001, ~class687.field10213.field526.method2323(480102311) == -2, 2, 22050);
         class218.field3290 = class381.method3096(0, class544.field8183, class498.field7578, (byte)118, 22050);
         class407.method3266(0, class562.method4238((class80)null, 121), true);
         class321.field4914 = class381.method3096(1, class544.field8183, class498.field7578, (byte)118, 2048);
         class321.field4914.method5574((byte)34, class426.field6579);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10758[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "b",
      descriptor = "(I)V",
      line = 26
   )
   public static void method5306(int arg0) {
      try {
         if (arg0 == 3) {
            field10745 = null;
            field10755 = null;
            field10742 = null;
            field10754 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10758[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "c",
      descriptor = "(I)V",
      line = 39
   )
   public final void method5307(int arg0) {
      try {
         ++field10740;
         synchronized(this) {
            if (this.field10739 == null) {
               this.field10739 = new IOException("");
            }

            this.notifyAll();
         }

         try {
            if (arg0 == 0) {
               this.field10738.join();
            }
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10758[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "([BIBI)V",
      line = 66
   )
   public final void method5308(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
      boolean var5 = client.field1786;

      try {
         ++field10748;
         if (arg3 >= 0 && ~arg1 <= -1 && ~arg0.length <= ~(arg1 - -arg3)) {
            synchronized(this) {
               if (this.field10739 != null) {
                  throw new IOException(this.field10739.toString());
               } else {
                  int var7;
                  label50: {
                     if (~this.field10756 < ~this.field10751) {
                        var7 = this.field10756 + -1 + -this.field10751;
                        if (!var5) {
                           break label50;
                        }
                     }

                     var7 = this.field10756 + this.field10752 - (this.field10751 + 1);
                  }

                  if (arg2 <= 83) {
                     this.field10738 = null;
                  }

                  if (~arg3 < ~var7) {
                     throw new IOException("");
                  } else {
                     label42: {
                        if (this.field10751 + arg3 > this.field10752) {
                           int var8 = -this.field10751 + this.field10752;
                           class107.method1027(arg0, arg1, this.field10749, this.field10751, var8);
                           class107.method1027(arg0, arg1 + var8, this.field10749, 0, -var8 + arg3);
                           if (!var5) {
                              break label42;
                           }
                        }

                        class107.method1027(arg0, arg1, this.field10749, this.field10751, arg3);
                     }

                     this.field10751 = (this.field10751 + arg3) % this.field10752;
                     this.notifyAll();
                  }
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field10758[7] + (arg0 != null ? field10758[3] : field10758[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "run",
      descriptor = "()V",
      line = 108
   )
   public final void run() {
      boolean var1 = client.field1786;

      try {
         ++field10743;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label61: {
                     if (this.field10739 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (~this.field10756 >= ~this.field10751) {
                        var3 = -this.field10756 + this.field10751;
                        if (!var1) {
                           break label61;
                        }
                     }

                     var3 = -this.field10756 - -this.field10751 + this.field10752;
                  }

                  if (~var3 < -1) {
                     break;
                  }

                  try {
                     this.field10750.flush();
                  } catch (IOException var18) {
                     this.field10739 = var18;
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var19) {
                     if (var1) {
                        break;
                     }
                  }
               }
            }

            try {
               label76: {
                  if (~this.field10752 <= ~(this.field10756 + var3)) {
                     this.field10750.write(this.field10749, this.field10756, var3);
                     if (!var1) {
                        break label76;
                     }
                  }

                  int var5 = -this.field10756 + this.field10752;
                  this.field10750.write(this.field10749, this.field10756, var5);
                  this.field10750.write(this.field10749, 0, -var5 + var3);
               }
            } catch (IOException var21) {
               IOException var6 = var21;
               synchronized(this) {
                  this.field10739 = var6;
                  return;
               }
            }

            synchronized(this) {
               this.field10756 = (this.field10756 + var3) % this.field10752;
            }
         }
      } catch (RuntimeException var22) {
         throw class482.method3757(var22, field10758[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "d",
      descriptor = "(I)V",
      line = 179
   )
   public final void method5309(int arg0) {
      try {
         ++field10737;
         this.field10750 = new class531();
         if (arg0 != 2048) {
            method5311(0.3208422F, 0.9079197F, -65, (byte)-121, -99, (float[])null, 100, 33, 12, 118, 0.61490256F, 58, 119, (float[])null);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10758[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(BLwo;)V",
      line = 190
   )
   public static final void method5310(byte arg0, class9 arg1) {
      try {
         if (arg0 != 113) {
            field10745 = null;
         }

         ++field10741;
         class168 var2 = (class168)class211.field3195.method3141((long)arg1.field1640, true);
         if (var2 != null) {
            if (var2.field2557 != null) {
               class426.field6579.method4704(var2.field2557);
               var2.field2557 = null;
            }

            var2.method2477(1976);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10758[5] + arg0 + ',' + (arg1 != null ? field10758[3] : field10758[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "<init>",
      descriptor = "(Ljava/io/OutputStream;I)V",
      line = 356
   )
   public class717(OutputStream arg0, int arg1) {
      try {
         this.field10750 = arg0;
         this.field10752 = arg1 + 1;
         this.field10749 = new byte[this.field10752];
         this.field10738 = new Thread(this);
         this.field10738.setDaemon(true);
         this.field10738.start();
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10758[1] + (arg0 != null ? field10758[3] : field10758[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(FFIBI[FIIIIFII[F)V",
      line = 233
   )
   public static final void method5311(float arg0, float arg1, int arg2, byte arg3, int arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, float arg10, int arg11, int arg12, float[] arg13) {
      boolean var14 = client.field1786;

      try {
         if (arg3 != -20) {
            method5305(-100);
         }

         float var18;
         float var19;
         label80: {
            int var25 = arg11 - arg4;
            int var26 = arg12 - arg2;
            ++field10747;
            int var24 = arg6 - arg9;
            float var15 = arg5[2] * (float)var24 + arg5[1] * (float)var26 + arg5[0] * (float)var25;
            float var16 = arg5[5] * (float)var24 + arg5[3] * (float)var25 + arg5[4] * (float)var26;
            float var17 = arg5[8] * (float)var24 + arg5[7] * (float)var26 + arg5[6] * (float)var25;
            if (arg7 == 0) {
               var18 = -var17 + arg0 + 0.5F;
               var19 = arg10 + var15 + 0.5F;
               if (!var14) {
                  break label80;
               }
            }

            if (~arg7 != -2) {
               if (arg7 != 2) {
                  if (arg7 == 3) {
                     var18 = -var16 + arg1 + 0.5F;
                     var19 = arg10 + var15 + 0.5F;
                     if (!var14) {
                        break label80;
                     }
                  }

                  if (~arg7 == -5) {
                     var19 = arg0 + var17 + 0.5F;
                     var18 = -var16 + arg1 + 0.5F;
                     if (!var14) {
                        break label80;
                     }
                  }

                  var19 = -var17 + arg0 + 0.5F;
                  var18 = -var16 + arg1 + 0.5F;
                  if (!var14) {
                     break label80;
                  }
               }

               var18 = -var16 + arg1 + 0.5F;
               var19 = -var15 + arg10 + 0.5F;
               if (!var14) {
                  break label80;
               }
            }

            var19 = arg10 + var15 + 0.5F;
            var18 = arg0 + var17 + 0.5F;
         }

         label56: {
            if (arg8 != 1) {
               if (arg8 != 2) {
                  if (~arg8 != -4) {
                     break label56;
                  }

                  float var20 = var19;
                  var19 = var18;
                  var18 = -var20;
                  if (!var14) {
                     break label56;
                  }
               }

               var18 = -var18;
               var19 = -var19;
               if (!var14) {
                  break label56;
               }
            }

            float var21 = var19;
            var19 = -var18;
            var18 = var21;
         }

         arg13[0] = var19;
         arg13[1] = var18;
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field10758[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10758[3] : field10758[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + (arg13 != null ? field10758[3] : field10758[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5312(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5313(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
