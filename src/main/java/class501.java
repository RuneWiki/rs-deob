import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class501 implements Runnable {
   @OriginalMember(
      owner = "client!nm",
      name = "g",
      descriptor = "I"
   )
   private int field7261 = 0;
   @OriginalMember(
      owner = "client!nm",
      name = "k",
      descriptor = "I"
   )
   private int field7271 = 0;
   @OriginalMember(
      owner = "client!nm",
      name = "i",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field7263;
   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "I"
   )
   private int field7276;
   @OriginalMember(
      owner = "client!nm",
      name = "o",
      descriptor = "[B"
   )
   private byte[] field7260;
   @OriginalMember(
      owner = "client!nm",
      name = "s",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field7266;
   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7280 = new String[]{method3643(method3642("}4S1*")), method3643(method3642("}4S4*")), method3643(method3642("}4S2*")), method3643(method3642("hwS^\u007f")), method3643(method3642("},\u0011\u001c")), method3643(method3642("}4S3*")), method3643(method3642("}4S\u0002w}q")), method3643(method3642("}4S6*")), method3643(method3642("}4S5*")), method3643(method3642("}4SLk}0\tN*"))};
   @OriginalMember(
      owner = "client!nm",
      name = "t",
      descriptor = "I"
   )
   public static int field7267 = 0;
   @OriginalMember(
      owner = "client!nm",
      name = "j",
      descriptor = "[S"
   )
   private static short[] field7272 = new short[]{952, 20413, -21592, 11204, -10305};
   @OriginalMember(
      owner = "client!nm",
      name = "f",
      descriptor = "[S"
   )
   private static short[] field7275 = new short[]{962, 20423, -21582, 11214, -10295};
   @OriginalMember(
      owner = "client!nm",
      name = "m",
      descriptor = "[S"
   )
   private static short[] field7264 = new short[]{967, 20428, -21577, 11219, -10290};
   @OriginalMember(
      owner = "client!nm",
      name = "b",
      descriptor = "[S"
   )
   private static short[] field7279 = new short[]{957, 20418, -21587, 11209, -10300};
   @OriginalMember(
      owner = "client!nm",
      name = "d",
      descriptor = "[[S"
   )
   public static short[][] field7274 = new short[][]{field7264, field7275, field7279, field7272};
   @OriginalMember(
      owner = "client!nm",
      name = "e",
      descriptor = "I"
   )
   public static int field7262;
   @OriginalMember(
      owner = "client!nm",
      name = "l",
      descriptor = "I"
   )
   public static int field7265;
   @OriginalMember(
      owner = "client!nm",
      name = "q",
      descriptor = "I"
   )
   public static int field7268;
   @OriginalMember(
      owner = "client!nm",
      name = "h",
      descriptor = "I"
   )
   public static int field7269;
   @OriginalMember(
      owner = "client!nm",
      name = "c",
      descriptor = "I"
   )
   public static int field7273;
   @OriginalMember(
      owner = "client!nm",
      name = "n",
      descriptor = "I"
   )
   public static int field7277;
   @OriginalMember(
      owner = "client!nm",
      name = "r",
      descriptor = "I"
   )
   public static int field7278;
   @OriginalMember(
      owner = "client!nm",
      name = "p",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field7270;

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(BI)V",
      line = 4
   )
   public static final void method3635(byte arg0, int arg1) {
      try {
         ++field7277;
         class755 var2 = class317.method2325((long)arg1, 102, 10);
         var2.method5481(arg0 + -183);
         if (arg0 != 93) {
            field7264 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7280[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "([BIBI)V",
      line = 25
   )
   public final void method3636(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
      boolean var5 = client.field4360;

      try {
         ++field7269;
         if (~arg3 <= -1 && arg1 >= 0 && arg0.length >= arg1 + arg3) {
            synchronized(this) {
               if (this.field7270 != null) {
                  throw new IOException(this.field7270.toString());
               } else {
                  int var7;
                  label54: {
                     if (~this.field7271 <= ~this.field7261) {
                        var7 = -this.field7271 + this.field7276 + this.field7261 + -1;
                        if (!var5) {
                           break label54;
                        }
                     }

                     var7 = this.field7261 - 1 + -this.field7271;
                  }

                  if (arg2 == -126) {
                     if (var7 < arg3) {
                        throw new IOException("");
                     } else {
                        label46: {
                           if (this.field7276 >= this.field7271 + arg3) {
                              class242.method1848(arg0, arg1, this.field7260, this.field7271, arg3);
                              if (!var5) {
                                 break label46;
                              }
                           }

                           int var8 = -this.field7271 + this.field7276;
                           class242.method1848(arg0, arg1, this.field7260, this.field7271, var8);
                           class242.method1848(arg0, arg1 + var8, this.field7260, 0, -var8 + arg3);
                        }

                        this.field7271 = (this.field7271 + arg3) % this.field7276;
                        this.notifyAll();
                     }
                  }
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field7280[7] + (arg0 != null ? field7280[3] : field7280[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "run",
      descriptor = "()V",
      line = 70
   )
   public final void run() {
      boolean var1 = client.field4360;

      try {
         ++field7265;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label61: {
                     if (this.field7270 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (this.field7271 >= this.field7261) {
                        var3 = -this.field7261 + this.field7271;
                        if (!var1) {
                           break label61;
                        }
                     }

                     var3 = -this.field7261 + this.field7276 + this.field7271;
                  }

                  if (~var3 < -1) {
                     break;
                  }

                  try {
                     this.field7263.flush();
                  } catch (IOException var18) {
                     this.field7270 = var18;
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
                  if (~(this.field7261 - -var3) >= ~this.field7276) {
                     this.field7263.write(this.field7260, this.field7261, var3);
                     if (!var1) {
                        break label76;
                     }
                  }

                  int var5 = -this.field7261 + this.field7276;
                  this.field7263.write(this.field7260, this.field7261, var5);
                  this.field7263.write(this.field7260, 0, -var5 + var3);
               }
            } catch (IOException var21) {
               IOException var6 = var21;
               synchronized(this) {
                  this.field7270 = var6;
                  return;
               }
            }

            synchronized(this) {
               this.field7261 = (this.field7261 + var3) % this.field7276;
            }
         }
      } catch (RuntimeException var22) {
         throw class237.method1823(var22, field7280[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "<init>",
      descriptor = "(Ljava/io/OutputStream;I)V",
      line = 237
   )
   public class501(OutputStream arg0, int arg1) {
      try {
         this.field7263 = arg0;
         this.field7276 = arg1 + 1;
         this.field7260 = new byte[this.field7276];
         this.field7266 = new Thread(this);
         this.field7266.setDaemon(true);
         this.field7266.start();
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7280[9] + (arg0 != null ? field7280[3] : field7280[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "()V",
      line = 141
   )
   public static final void method3637() {
      for(int var0 = 0; var0 < class314.field4294.length; ++var0) {
         class314.field4294[var0].method3772();
      }

      class314.field4294 = null;
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(B)V",
      line = 156
   )
   public final void method3638(byte arg0) {
      try {
         ++field7262;
         synchronized(this) {
            if (this.field7270 == null) {
               this.field7270 = new IOException("");
            }

            this.notifyAll();
            if (arg0 != 28) {
               field7274 = null;
            }
         }

         try {
            this.field7266.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7280[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(IZLjava/lang/String;)V",
      line = 190
   )
   public static final void method3639(int arg0, boolean arg1, String arg2) {
      try {
         ++class97.field1249;
         ++field7268;
         if (arg1) {
            method3635((byte)43, 113);
         }

         class10 var3 = class292.method2192(-9730);
         class447 var4 = class40.method350(class747.field10990, var3.field106, true);
         var4.field6359.method1186(1 + class89.method783(1, arg2), 0);
         var4.field6359.method1195((byte)30, arg2);
         var4.field6359.method1183(-637822779, arg0);
         var3.method55(13256, var4);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7280[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7280[3] : field7280[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "b",
      descriptor = "(I)V",
      line = 210
   )
   public static void method3640(int arg0) {
      try {
         field7272 = null;
         field7274 = null;
         field7279 = null;
         field7275 = null;
         if (arg0 >= -81) {
            method3639(-56, true, (String)null);
         }

         field7264 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7280[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(I)V",
      line = 227
   )
   public final void method3641(int arg0) {
      try {
         if (arg0 != 962) {
            method3635((byte)-62, -27);
         }

         ++field7278;
         this.field7263 = new class774();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7280[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3642(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3643(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
