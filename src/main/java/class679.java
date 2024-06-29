import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class679 {
   @OriginalMember(
      owner = "client!pl",
      name = "m",
      descriptor = "Ljava/io/RandomAccessFile;"
   )
   private RandomAccessFile field10005;
   @OriginalMember(
      owner = "client!pl",
      name = "i",
      descriptor = "J"
   )
   private long field9996;
   @OriginalMember(
      owner = "client!pl",
      name = "v",
      descriptor = "Ljava/io/File;"
   )
   private File field9999;
   @OriginalMember(
      owner = "client!pl",
      name = "k",
      descriptor = "J"
   )
   private long field10009;
   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10019 = new String[]{method4965(method4964("D\u0018cU7")), method4965(method4964("D\u0018cP7")), method4965(method4964("Z\u0001!t")), method4965(method4964("OZc6b")), method4965(method4964("D\u0018cR7")), method4965(method4964("D\u0018cZ7")), method4965(method4964("D\u0018c]7")), method4965(method4964("D\u0018c[7")), method4965(method4964("D\u0018cY7")), method4965(method4964("D\u0018cS7")), method4965(method4964("c\u0015?vvZ\u0013l8y]\u0018(wqP\u001d>s?")), method4965(method4964("D\u0018c~vZ\u0015!qeQ\\")), method4965(method4964("\u0014\u001a\"l?W\u0018\"kzPT.wmF\u0011.lsMT8kvZ\u0013m{s[\u0007(06\u001aT\fmk[Y.tpG\u001d#\u007f?]\u001a>lzU\u0010c8")), method4965(method4964("D\u0018c_7")), method4965(method4964("D\u0018c$vZ\u001d9&7")), method4965(method4964("D\u0018c^7")), method4965(method4964("D\u0018c\\7"))};
   @OriginalMember(
      owner = "client!pl",
      name = "o",
      descriptor = "I"
   )
   public static int field10000 = 1;
   @OriginalMember(
      owner = "client!pl",
      name = "f",
      descriptor = "Llea;"
   )
   public static class639 field10004 = new class639(9, 7);
   @OriginalMember(
      owner = "client!pl",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field10015 = false;
   @OriginalMember(
      owner = "client!pl",
      name = "t",
      descriptor = "Lns;"
   )
   public static class427 field10013 = new class427();
   @OriginalMember(
      owner = "client!pl",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field10018 = false;
   @OriginalMember(
      owner = "client!pl",
      name = "w",
      descriptor = "I"
   )
   public static int field10016 = 0;
   @OriginalMember(
      owner = "client!pl",
      name = "j",
      descriptor = "I"
   )
   public static int field10001;
   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "I"
   )
   public static int field10002;
   @OriginalMember(
      owner = "client!pl",
      name = "l",
      descriptor = "I"
   )
   public static int field10003;
   @OriginalMember(
      owner = "client!pl",
      name = "b",
      descriptor = "I"
   )
   public static int field10006;
   @OriginalMember(
      owner = "client!pl",
      name = "c",
      descriptor = "I"
   )
   public static int field10007;
   @OriginalMember(
      owner = "client!pl",
      name = "s",
      descriptor = "I"
   )
   public static int field10008;
   @OriginalMember(
      owner = "client!pl",
      name = "u",
      descriptor = "I"
   )
   public static int field10010;
   @OriginalMember(
      owner = "client!pl",
      name = "e",
      descriptor = "I"
   )
   public static int field10011;
   @OriginalMember(
      owner = "client!pl",
      name = "q",
      descriptor = "I"
   )
   public static int field10012;
   @OriginalMember(
      owner = "client!pl",
      name = "h",
      descriptor = "I"
   )
   public static int field10014;
   @OriginalMember(
      owner = "client!pl",
      name = "p",
      descriptor = "I"
   )
   public static int field9997;
   @OriginalMember(
      owner = "client!pl",
      name = "n",
      descriptor = "I"
   )
   public static int field9998;
   @OriginalMember(
      owner = "client!pl",
      name = "d",
      descriptor = "Lwe;"
   )
   public static class431 field10017;

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method4951(int arg0, int arg1) {
      try {
         ++field10012;
         if (arg1 != -201) {
            return true;
         } else {
            return arg0 == 3 || arg0 == 4;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10019[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(Lgca;)V"
   )
   public static final void method4952(class263 arg0) {
      class146.field1851 = arg0;
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4953(int arg0) {
      try {
         field10004 = null;
         field10017 = null;
         field10013 = null;
         if (arg0 != 21840) {
            field10017 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10019[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method4954(int arg0) throws IOException {
      try {
         ++field10001;
         return arg0 != 48 ? 70L : this.field10005.length();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10019[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(Lji;)V"
   )
   public static final void method4955(class637 arg0) {
      if (class299.field4095 < 65535) {
         class389 var1 = arg0.field9324;
         class220.field3145[class299.field4095] = arg0;
         class195.field2759[class299.field4095] = false;
         ++class299.field4095;
         int var2 = arg0.field9327;
         if (arg0.field9315) {
            var2 = 0;
         }

         int var3 = arg0.field9327;
         if (arg0.field9325) {
            var3 = class154.field2185 - 1;
         }

         for(int var4 = var2; var4 <= var3; ++var4) {
            int var5 = 0;
            int var6 = var1.method2963(true) - var1.method2958((byte)111) + class436.field6247 >> class773.field11359;
            if (var6 < 0) {
               var5 -= var6;
               var6 = 0;
            }

            int var7 = var1.method2963(true) + var1.method2958((byte)-120) - class436.field6247 >> class773.field11359;
            if (var7 >= class16.field190) {
               var7 = class16.field190 - 1;
            }

            for(int var8 = var6; var8 <= var7; ++var8) {
               short var9 = arg0.field9329[var5++];
               int var10 = (var1.method2955(false) - var1.method2958((byte)-101) + class436.field6247 >> class773.field11359) + (var9 >>> 8);
               int var11 = (var9 & 255) + var10 - 1;
               if (var10 < 0) {
                  var10 = 0;
               }

               if (var11 >= class457.field6539) {
                  var11 = class457.field6539 - 1;
               }

               for(int var12 = var10; var12 <= var11; ++var12) {
                  long var13 = class409.field5919[var4][var12][var8];
                  if ((var13 & 65535L) == 0L) {
                     class409.field5919[var4][var12][var8] = var13 | (long)class299.field4095;
                  } else if ((var13 & 4294901760L) == 0L) {
                     class409.field5919[var4][var12][var8] = var13 | (long)class299.field4095 << 16;
                  } else if ((var13 & 281470681743360L) == 0L) {
                     class409.field5919[var4][var12][var8] = var13 | (long)class299.field4095 << 32;
                  } else if ((var13 & -281474976710656L) == 0L) {
                     class409.field5919[var4][var12][var8] = var13 | (long)class299.field4095 << 48;
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field10006;
         if (this.field10005 != null) {
            System.out.println(field10019[10] + this.field9999 + field10019[12]);
            this.method4960(true);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10019[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "([BIIB)I"
   )
   public final int method4956(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
      try {
         ++field10008;
         int var5 = this.field10005.read(arg0, arg1, arg2);
         if (arg3 >= -28) {
            field10018 = false;
         }

         if (var5 > 0) {
            this.field9996 += (long)var5;
         }

         return var5;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10019[6] + (arg0 != null ? field10019[3] : field10019[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public static final void method4957(String arg0, byte arg1) {
      boolean var2 = client.field4360;

      try {
         ++field10014;
         if (arg0 != null) {
            if ((class710.field10360 < 200 || class379.field5466) && ~class710.field10360 > -201) {
               String var3 = class738.method5357(-57, arg0);
               if (var3 != null) {
                  byte var10000;
                  label98: {
                     int var4 = 0;
                     if (var2) {
                        var10000 = -43;
                     } else if (~var4 <= ~class710.field10360) {
                        var10000 = 0;
                        if (!var2) {
                           break label98;
                        }
                     } else {
                        var10000 = -43;
                     }

                     while(true) {
                        String var5 = class738.method5357(var10000, class581.field8554[var4]);
                        if (var5 != null && var5.equals(var3)) {
                           class684.method4989(arg0 + class180.field2517.method1437(class608.field8920, 50), 4, 4095);
                           return;
                        }

                        if (class9.field88[var4] != null) {
                           String var6 = class738.method5357(-106, class9.field88[var4]);
                           if (var6 != null && var6.equals(var3)) {
                              class684.method4989(arg0 + class180.field2517.method1437(class608.field8920, 50), 4, 4095);
                              return;
                           }
                        }

                        ++var4;
                        if (~var4 <= ~class710.field10360) {
                           var10000 = 0;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = -43;
                        }
                     }
                  }

                  int var7 = var10000;
                  class10 var10;
                  class447 var11;
                  if (var2) {
                     var10000 = -122;
                  } else if (var7 >= class640.field9356) {
                     var10000 = class738.method5357(-50, class564.field8045.field1575).equals(var3);
                     if (!var2) {
                        if (var10000 != 0) {
                           class684.method4989(class180.field2520.method1437(class608.field8920, 50), 4, 4095);
                           return;
                        }

                        if (arg1 <= 25) {
                           return;
                        }

                        ++class379.field5465;
                        var10 = class292.method2192(-9730);
                        var11 = class40.method350(class481.field6891, var10.field106, true);
                        var11.field6359.method1186(class89.method783(1, arg0), 0);
                        var11.field6359.method1195((byte)71, arg0);
                        var10.method55(13256, var11);
                        return;
                     }
                  } else {
                     var10000 = -122;
                  }

                  while(true) {
                     String var8 = class738.method5357(var10000, class640.field9350[var7]);
                     if (var8 != null && var8.equals(var3)) {
                        class684.method4989(class180.field2522.method1437(class608.field8920, 50) + arg0 + class180.field2523.method1437(class608.field8920, 50), 4, 4095);
                        return;
                     }

                     if (class295.field4068[var7] != null) {
                        String var9 = class738.method5357(-117, class295.field4068[var7]);
                        if (var9 != null && var9.equals(var3)) {
                           class684.method4989(class180.field2522.method1437(class608.field8920, 50) + arg0 + class180.field2523.method1437(class608.field8920, 50), 4, 4095);
                           return;
                        }
                     }

                     ++var7;
                     if (var7 >= class640.field9356) {
                        var10000 = class738.method5357(-50, class564.field8045.field1575).equals(var3);
                        if (!var2) {
                           if (var10000 != 0) {
                              class684.method4989(class180.field2520.method1437(class608.field8920, 50), 4, 4095);
                              return;
                           }

                           if (arg1 <= 25) {
                              return;
                           }

                           ++class379.field5465;
                           var10 = class292.method2192(-9730);
                           var11 = class40.method350(class481.field6891, var10.field106, true);
                           var11.field6359.method1186(class89.method783(1, arg0), 0);
                           var11.field6359.method1195((byte)71, arg0);
                           var10.method55(13256, var11);
                           return;
                        }
                     } else {
                        var10000 = -122;
                     }
                  }
               }
            } else {
               class684.method4989(class180.field2490.method1437(class608.field8920, 50), 4, 4095);
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field10019[9] + (arg0 != null ? field10019[3] : field10019[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method4958(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      try {
         ++field10010;
         if (arg3 != 1) {
            field10000 = -128;
         }

         if (~((long)arg1 + this.field9996) < ~this.field10009) {
            this.field10005.seek(this.field10009);
            this.field10005.write(1);
            throw new EOFException();
         } else {
            this.field10005.write(arg2, arg0, arg1);
            this.field9996 += (long)arg1;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10019[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10019[3] : field10019[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(JB)V"
   )
   public final void method4959(long arg0, byte arg1) throws IOException {
      try {
         ++field10011;
         this.field10005.seek(arg0);
         if (arg1 != 2) {
            field10013 = null;
         }

         this.field9996 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10019[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method4960(boolean arg0) throws IOException {
      try {
         ++field10003;
         if (this.field10005 != null) {
            this.field10005.close();
            this.field10005 = null;
         }

         if (!arg0) {
            this.method4961(true);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10019[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "b",
      descriptor = "(Z)Ljava/io/File;"
   )
   public final File method4961(boolean arg0) {
      try {
         ++field10007;
         return arg0 ? null : this.field9999;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10019[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4962(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -24190) {
            return false;
         } else {
            ++field10002;
            return ~(arg0 & 2048) != -1 && ~(55 & arg2) != -1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10019[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(Lkda;B)Z"
   )
   public static final boolean method4963(class412 arg0, byte arg1) {
      try {
         ++field9997;
         if (arg1 > -43) {
            return true;
         } else {
            return class161.field2298 == arg0 || class408.field5903 == arg0 || class644.field9405 == arg0 || class657.field9600 == arg0 || class282.field3914 == arg0;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10019[1] + (arg0 != null ? field10019[3] : field10019[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "<init>",
      descriptor = "(Ljava/io/File;Ljava/lang/String;J)V"
   )
   public class679(File arg0, String arg1, long arg2) throws IOException {
      try {
         if (~arg2 == 0L) {
            arg2 = Long.MAX_VALUE;
         }

         if (arg0.length() > arg2) {
            arg0.delete();
         }

         this.field10005 = new RandomAccessFile(arg0, arg1);
         this.field9996 = 0L;
         this.field9999 = arg0;
         this.field10009 = arg2;
         int var5 = this.field10005.read();
         if (~var5 != 0 && !arg1.equals("r")) {
            this.field10005.seek(0L);
            this.field10005.write(var5);
         }

         this.field10005.seek(0L);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10019[14] + (arg0 != null ? field10019[3] : field10019[2]) + ',' + (arg1 != null ? field10019[3] : field10019[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4964(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4965(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
