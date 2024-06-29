import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class371 implements Runnable {
   @OriginalMember(
      owner = "client!ak",
      name = "g",
      descriptor = "I"
   )
   private int field5231 = 0;
   @OriginalMember(
      owner = "client!ak",
      name = "o",
      descriptor = "I"
   )
   private int field5233 = 0;
   @OriginalMember(
      owner = "client!ak",
      name = "p",
      descriptor = "I"
   )
   private int field5235;
   @OriginalMember(
      owner = "client!ak",
      name = "f",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field5225;
   @OriginalMember(
      owner = "client!ak",
      name = "i",
      descriptor = "[B"
   )
   private byte[] field5224;
   @OriginalMember(
      owner = "client!ak",
      name = "e",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field5222;
   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5239 = new String[]{method2875(method2874("DL8)=")), method2875(method2874("DL8*=")), method2875(method2874("DL8-=")), method2875(method2874("DL8.=")), method2875(method2874("^\t8Ah")), method2875(method2874("KRz\u0003")), method2875(method2874("DL8(=")), method2875(method2874("DL8S|KNbQ=")), method2875(method2874("DL8+=")), method2875(method2874("DL8\u001d`K\u000f")), method2875(method2874("DL8,="))};
   @OriginalMember(
      owner = "client!ak",
      name = "m",
      descriptor = "Lod;"
   )
   public static class536 field5229 = new class536();
   @OriginalMember(
      owner = "client!ak",
      name = "c",
      descriptor = "I"
   )
   public static int field5226;
   @OriginalMember(
      owner = "client!ak",
      name = "h",
      descriptor = "I"
   )
   public static int field5228;
   @OriginalMember(
      owner = "client!ak",
      name = "q",
      descriptor = "I"
   )
   public static int field5230;
   @OriginalMember(
      owner = "client!ak",
      name = "j",
      descriptor = "I"
   )
   public static int field5232;
   @OriginalMember(
      owner = "client!ak",
      name = "l",
      descriptor = "I"
   )
   public static int field5234;
   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "I"
   )
   public static int field5236;
   @OriginalMember(
      owner = "client!ak",
      name = "k",
      descriptor = "I"
   )
   public static int field5237;
   @OriginalMember(
      owner = "client!ak",
      name = "n",
      descriptor = "Lig;"
   )
   public static class257 field5238;
   @OriginalMember(
      owner = "client!ak",
      name = "b",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field5223;
   @OriginalMember(
      owner = "client!ak",
      name = "d",
      descriptor = "[[I"
   )
   public static int[][] field5227;

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(Z[BII)I"
   )
   public final int method2867(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      boolean var5 = client.field4273;

      try {
         ++field5236;
         if (arg3 >= 0 && ~arg2 <= -1 && ~arg1.length <= ~(arg2 + arg3)) {
            synchronized(this) {
               int var7;
               label57: {
                  if (this.field5233 >= this.field5231) {
                     var7 = -this.field5231 + this.field5233;
                     if (!var5) {
                        break label57;
                     }
                  }

                  var7 = -this.field5231 + this.field5233 + this.field5235;
               }

               if (~var7 > ~arg3) {
                  arg3 = var7;
               }

               if (arg3 == 0 && this.field5223 != null) {
                  throw new IOException(this.field5223.toString());
               } else {
                  label49: {
                     if (~(this.field5231 + arg3) < ~this.field5235) {
                        int var8 = this.field5235 - this.field5231;
                        class714.method5200(this.field5224, this.field5231, arg1, arg2, var8);
                        class714.method5200(this.field5224, 0, arg1, arg2 + var8, -var8 + arg3);
                        if (!var5) {
                           break label49;
                        }
                     }

                     class714.method5200(this.field5224, this.field5231, arg1, arg2, arg3);
                  }

                  this.field5231 = (this.field5231 + arg3) % this.field5235;
                  if (arg0) {
                     this.field5222 = null;
                  }

                  this.notifyAll();
                  return arg3;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field5239[3] + arg0 + ',' + (arg1 != null ? field5239[4] : field5239[5]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public final boolean method2868(int arg0, boolean arg1) throws IOException {
      try {
         ++field5237;
         if (~arg0 < -1 && arg0 < this.field5235) {
            if (arg1) {
               method2870((byte)66);
            }

            synchronized(this) {
               int var4;
               label37: {
                  if (this.field5233 >= this.field5231) {
                     var4 = -this.field5231 + this.field5233;
                     if (!client.field4273) {
                        break label37;
                     }
                  }

                  var4 = this.field5235 + this.field5233 - this.field5231;
               }

               if (~var4 > ~arg0) {
                  if (this.field5223 != null) {
                     throw new IOException(this.field5223.toString());
                  } else {
                     this.notifyAll();
                     return false;
                  }
               } else {
                  return true;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field5239[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2869(int arg0) {
      try {
         synchronized(this) {
            if (this.field5223 == null) {
               this.field5223 = new IOException("");
            }

            if (arg0 != -1) {
               return;
            }

            this.notifyAll();
         }

         ++field5234;

         try {
            this.field5222.join();
         } catch (InterruptedException var6) {
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field5239[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2870(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field5228;
         class206 var2 = class605.field8474.field2788;
         if (arg0 >= -58) {
            field5229 = null;
         }

         while(true) {
            if (~var2.method1561(class605.field8474.field2798, (byte)108) <= -16) {
               int var3 = var2.method1566(15, -12869);
               if (var3 != 32767) {
                  boolean var4 = false;
                  class243 var5 = (class243)class335.field4808.method1839(18, (long)var3);
                  if (var5 == null) {
                     class680 var6 = new class680();
                     var6.field7843 = var3;
                     var5 = new class243(var6);
                     class335.field4808.method1841((long)var3, true, var5);
                     class270.field3519[class667.field9489++] = var5;
                     var4 = true;
                  }

                  class680 var7 = var5.field3043;
                  class285.field3785[class741.field10800++] = var3;
                  var7.field7799 = class306.field4066;
                  if (var7.field9989 != null && var7.field9989.method2983(24238)) {
                     class501.method3619(var7, false);
                  }

                  int var8 = var2.method1566(5, -12869);
                  if (var8 > 15) {
                     var8 -= 32;
                  }

                  int var9 = var2.method1566(2, -12869);
                  int var10 = 14374 & 4 + var2.method1566(3, -12869) << 11;
                  var7.method4975(class742.field10813.method2428(-24138, var2.method1566(14, -12869)), 120);
                  int var11 = var2.method1566(5, -12869);
                  if (~var11 < -16) {
                     var11 -= 32;
                  }

                  int var12 = var2.method1566(1, -12869);
                  int var13 = var2.method1566(1, -12869);
                  if (~var13 == -2) {
                     class404.field5683[class331.field4734++] = var3;
                  }

                  var7.method4085(var7.field9989.field5538, (byte)120);
                  var7.field7783 = var7.field9989.field5511 << 3;
                  if (var4) {
                     var7.method4077(var10, 1, true);
                  }

                  var7.method4973(~var12 == -2, var9, var7.method3060((byte)38), 0, class278.field3709.field7855[0] + var11, class278.field3709.field7853[0] + var8);
                  if (!var7.field9989.method2983(24238)) {
                     continue;
                  }

                  class30.method245(var7.field7855[0], (class774)null, var7.field1001, (class404)null, 0, var7.field7853[0], var7, true);
                  if (var1) {
                     break;
                  }

                  if (!var1) {
                     continue;
                  }
               }
            }

            var2.method1554(7);
            break;
         }

      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field5239[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(Lbs;IIII)Z"
   )
   public static final boolean method2871(class718 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field5232;
         if (class233.field2888 && class480.field6633) {
            if (class111.field1406 < 100) {
               return false;
            } else if (!class486.method3534(arg3, arg4, -17319, arg1)) {
               return false;
            } else {
               int var5 = arg3 << class76.field965;
               int var6 = arg4 << class76.field965;
               int var7 = class93.field1241[arg1].method2221(false, arg4, arg3) + -1;
               int var8 = arg0.method782(61) + var7;
               if (arg0.field10521 == 1) {
                  if (!class432.method3235(var6, class212.field2635 + var6, var8, var5, var6, var8, true, var5, var5, var7)) {
                     return false;
                  } else if (!class432.method3235(var6, class212.field2635 + var6, var8, var5, var6 - -class212.field2635, var7, true, var5, var5, var7)) {
                     return false;
                  } else {
                     ++class163.field2096;
                     return true;
                  }
               } else if (~arg0.field10521 == -3) {
                  if (!class432.method3235(var6 - -class212.field2635, class212.field2635 + var6, var8, var5, class212.field2635 + var6, var8, true, var5, var5 - -class212.field2635, var7)) {
                     return false;
                  } else if (!class432.method3235(var6 - -class212.field2635, class212.field2635 + var6, var7, var5 - -class212.field2635, var6 - -class212.field2635, var8, true, var5, class212.field2635 + var5, var7)) {
                     return false;
                  } else {
                     ++class163.field2096;
                     return true;
                  }
               } else if (~arg0.field10521 == -5) {
                  if (!class432.method3235(var6, class212.field2635 + var6, var8, var5 - -class212.field2635, var6, var8, true, class212.field2635 + var5, class212.field2635 + var5, var7)) {
                     return false;
                  } else if (!class432.method3235(var6, class212.field2635 + var6, var8, var5 - -class212.field2635, class212.field2635 + var6, var7, true, class212.field2635 + var5, var5 - -class212.field2635, var7)) {
                     return false;
                  } else {
                     ++class163.field2096;
                     return true;
                  }
               } else if (~arg0.field10521 == -9) {
                  if (!class432.method3235(var6, var6, var8, var5, var6, var8, true, var5, class212.field2635 + var5, var7)) {
                     return false;
                  } else if (!class432.method3235(var6, var6, var7, class212.field2635 + var5, var6, var8, true, var5, class212.field2635 + var5, var7)) {
                     return false;
                  } else {
                     ++class163.field2096;
                     return true;
                  }
               } else if (arg0.field10521 == 16) {
                  if (!class692.method5032(var7, class187.field2291, class187.field2291, var8, var5, arg2 + 862929584, class187.field2291 + var6)) {
                     return false;
                  } else {
                     ++class163.field2096;
                     return true;
                  }
               } else if (~arg0.field10521 == -33) {
                  if (!class692.method5032(var7, class187.field2291, class187.field2291, var8, class187.field2291 + var5, 862921836, var6 - -class187.field2291)) {
                     return false;
                  } else {
                     ++class163.field2096;
                     return true;
                  }
               } else {
                  if (arg2 != -7748) {
                     field5229 = null;
                  }

                  if (arg0.field10521 == 64) {
                     if (!class692.method5032(var7, class187.field2291, class187.field2291, var8, class187.field2291 + var5, 862921836, var6)) {
                        return false;
                     } else {
                        ++class163.field2096;
                        return true;
                     }
                  } else if (arg0.field10521 == 128) {
                     if (!class692.method5032(var7, class187.field2291, class187.field2291, var8, var5, 862921836, var6)) {
                        return false;
                     } else {
                        ++class163.field2096;
                        return true;
                     }
                  } else {
                     return true;
                  }
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field5239[8] + (arg0 != null ? field5239[4] : field5239[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4273;

      try {
         ++field5230;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label81: {
                     if (this.field5223 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (this.field5231 == 0) {
                        var3 = -this.field5233 + this.field5235 + -1;
                        if (!var1) {
                           break label81;
                        }
                     }

                     if (~this.field5231 >= ~this.field5233) {
                        var3 = -this.field5233 + this.field5235;
                        if (!var1) {
                           break label81;
                        }
                     }

                     var3 = this.field5231 + -1 - this.field5233;
                  }

                  if (~var3 < -1) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var15) {
                     if (var1) {
                        break;
                     }
                  }
               }
            }

            int var4;
            try {
               var4 = this.field5225.read(this.field5224, this.field5233, var3);
               if (var4 == -1) {
                  throw new EOFException();
               }
            } catch (IOException var17) {
               IOException var5 = var17;
               synchronized(this) {
                  this.field5223 = var5;
                  return;
               }
            }

            synchronized(this) {
               this.field5233 = (this.field5233 + var4) % this.field5235;
            }
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field5239[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2872(byte arg0) {
      try {
         field5227 = null;
         if (arg0 != 98) {
            method2872((byte)-125);
         }

         field5229 = null;
         field5238 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5239[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "<init>",
      descriptor = "(Ljava/io/InputStream;I)V"
   )
   public class371(InputStream arg0, int arg1) {
      try {
         this.field5235 = arg1 - -1;
         this.field5225 = arg0;
         this.field5224 = new byte[this.field5235];
         this.field5222 = new Thread(this);
         this.field5222.setDaemon(true);
         this.field5222.start();
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5239[7] + (arg0 != null ? field5239[4] : field5239[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2873(boolean arg0) {
      try {
         this.field5225 = new class619();
         if (arg0) {
            ++field5226;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5239[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2874(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2875(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
