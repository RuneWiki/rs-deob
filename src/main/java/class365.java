import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class365 extends class96 {
   @OriginalMember(
      owner = "client!mu",
      name = "E",
      descriptor = "Z"
   )
   public boolean field5408 = true;
   @OriginalMember(
      owner = "client!mu",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5416 = new String[]{method2877(method2876("^w%JZ")), method2877(method2876("^w%LZ")), method2877(method2876("H,%!\u000f")), method2877(method2876("]wgc")), method2877(method2876("^w%IZ")), method2877(method2876("^w%KZ")), method2877(method2876("^w%NZ")), method2877(method2876("^w%DZ")), method2877(method2876("^w%HZ")), method2877(method2876("^w%FZ")), method2877(method2876("^w%EZ")), method2877(method2876("^w%GZ")), method2877(method2876("\u001d,%")), method2877(method2876("^w%MZ"))};
   @OriginalMember(
      owner = "client!mu",
      name = "K",
      descriptor = "I"
   )
   public static int field5400 = 0;
   @OriginalMember(
      owner = "client!mu",
      name = "A",
      descriptor = "Lhha;"
   )
   public static class724 field5411 = new class724(114, 6);
   @OriginalMember(
      owner = "client!mu",
      name = "w",
      descriptor = "Lhha;"
   )
   public static class724 field5413 = new class724(92, 12);
   @OriginalMember(
      owner = "client!mu",
      name = "J",
      descriptor = "Ljava/util/zip/CRC32;"
   )
   public static CRC32 field5415 = new CRC32();
   @OriginalMember(
      owner = "client!mu",
      name = "F",
      descriptor = "I"
   )
   public static int field5395;
   @OriginalMember(
      owner = "client!mu",
      name = "C",
      descriptor = "I"
   )
   public static int field5397;
   @OriginalMember(
      owner = "client!mu",
      name = "I",
      descriptor = "I"
   )
   public static int field5402;
   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "I"
   )
   public static int field5403;
   @OriginalMember(
      owner = "client!mu",
      name = "x",
      descriptor = "I"
   )
   public static int field5405;
   @OriginalMember(
      owner = "client!mu",
      name = "s",
      descriptor = "I"
   )
   public static int field5406;
   @OriginalMember(
      owner = "client!mu",
      name = "t",
      descriptor = "I"
   )
   public static int field5407;
   @OriginalMember(
      owner = "client!mu",
      name = "u",
      descriptor = "I"
   )
   public static int field5409;
   @OriginalMember(
      owner = "client!mu",
      name = "B",
      descriptor = "I"
   )
   public static int field5410;
   @OriginalMember(
      owner = "client!mu",
      name = "y",
      descriptor = "I"
   )
   public static int field5412;
   @OriginalMember(
      owner = "client!mu",
      name = "q",
      descriptor = "Lsh;"
   )
   public static class207 field5401;
   @OriginalMember(
      owner = "client!mu",
      name = "D",
      descriptor = "Lua;"
   )
   public static class569 field5414;
   @OriginalMember(
      owner = "client!mu",
      name = "L",
      descriptor = "Lwja;"
   )
   public class97 field5398;
   @OriginalMember(
      owner = "client!mu",
      name = "H",
      descriptor = "[I"
   )
   private int[] field5394;
   @OriginalMember(
      owner = "client!mu",
      name = "G",
      descriptor = "[I"
   )
   public int[] field5404;
   @OriginalMember(
      owner = "client!mu",
      name = "v",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field5396;
   @OriginalMember(
      owner = "client!mu",
      name = "r",
      descriptor = "[[I"
   )
   private int[][] field5399;

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(I)Lie;"
   )
   public static final class639 method2865(int arg0) {
      try {
         ++field5403;
         class111.field1731 = arg0;
         return class13.method111((byte)114);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5416[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method2866(int arg0) {
      try {
         field5415 = null;
         field5401 = null;
         field5411 = null;
         field5414 = null;
         if (arg0 == -10610) {
            field5413 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5416[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(B)Ljava/lang/String;"
   )
   public final String method2867(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field5410;
         StringBuffer var3 = new StringBuffer(80);
         if (this.field5396 == null) {
            return "";
         } else {
            var3.append(this.field5396[0]);
            int var4 = 1;
            if (var2) {
               var3.append(field5416[12]);
               var3.append(this.field5396[var4]);
               ++var4;
            }

            while(true) {
               while(var4 < this.field5396.length) {
                  var3.append(field5416[12]);
                  var3.append(this.field5396[var4]);
                  ++var4;
               }

               if (!var2) {
                  if (arg0 < 87) {
                     method2866(97);
                  }

                  return var3.toString();
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5416[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lcu;I)Ljava/lang/String;"
   )
   public final String method2868(class65 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field5412;
         StringBuffer var4 = new StringBuffer(80);
         if (this.field5394 != null) {
            int var5 = 0;
            if (var3 || ~this.field5394.length < ~var5) {
               do {
                  var4.append(this.field5396[var5]);
                  var4.append(this.field5398.method966(this.method2873(var5, 0), this.field5399[var5], arg0.method645(false, class93.method946(arg1 + 1, this.field5394[var5]).field3617), arg1 ^ 3198));
                  ++var5;
               } while(~this.field5394.length < ~var5);
            }
         }

         var4.append(this.field5396[this.field5396.length + arg1]);
         return var4.toString();
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5416[1] + (arg0 != null ? field5416[2] : field5416[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method2869(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method2870(boolean arg0) {
      try {
         if (arg0) {
            method2865(-11);
         }

         ++field5409;
         return this.field5394 == null ? 0 : this.field5394.length;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5416[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lcu;B)V"
   )
   public final void method2871(class65 arg0, byte arg1) {
      boolean var3 = client.field10022;

      try {
         while(true) {
            int var4 = arg0.method665(false);
            if (~var4 != -1) {
               this.method2874(arg0, 2, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            int var5 = -110 % ((arg1 - -61) / 40);
            ++field5407;
            break;
         }

      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5416[4] + (arg0 != null ? field5416[2] : field5416[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lcu;[IB)V"
   )
   public final void method2872(class65 arg0, int[] arg1, byte arg2) {
      boolean var4 = client.field10022;

      try {
         ++field5395;
         if (this.field5394 != null) {
            int var10000;
            int var10001;
            label62: {
               int var5 = 0;
               int var6;
               if (var4) {
                  var6 = this.method2873(var5, 0).field3619;
                  if (var6 > 0) {
                     arg0.method642(-113, (long)arg1[var5], var6);
                  }

                  ++var5;
               }

               while(~var5 > ~this.field5394.length) {
                  var10000 = ~var5;
                  var10001 = ~arg1.length;
                  if (var4) {
                     break label62;
                  }

                  if (var10000 <= var10001) {
                     break;
                  }

                  var6 = this.method2873(var5, 0).field3619;
                  if (var6 > 0) {
                     arg0.method642(-113, (long)arg1[var5], var6);
                  }

                  ++var5;
               }

               var10000 = -79;
               var10001 = (62 - arg2) / 44;
            }

            int var7 = var10000 % var10001;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field5416[5] + (arg0 != null ? field5416[2] : field5416[3]) + ',' + (arg1 != null ? field5416[2] : field5416[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(II)Lbu;"
   )
   public final class234 method2873(int arg0, int arg1) {
      try {
         ++field5406;
         if (arg1 != 0) {
            this.method2869((byte)96);
         }

         return this.field5394 != null && arg0 >= 0 && ~this.field5394.length <= ~arg0 ? class93.method946(arg1, this.field5394[arg0]) : null;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5416[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   private final void method2874(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label95: {
            if (~arg2 == -2) {
               this.field5396 = class757.method5467(5, arg0.method640((byte)51), '<');
               if (!var4) {
                  break label95;
               }
            }

            if (arg2 != 2) {
               if (arg2 != 3) {
                  if (arg2 != 4) {
                     break label95;
                  }

                  this.field5408 = false;
                  if (!var4) {
                     break label95;
                  }
               }

               int var5 = arg0.method665(false);
               this.field5399 = new int[var5][];
               this.field5394 = new int[var5];
               int var6 = 0;
               if (var4 || ~var6 > ~var5) {
                  do {
                     int var7 = arg0.method685(-2);
                     class234 var8 = class93.method946(0, var7);
                     if (var8 == null) {
                        ++var6;
                     } else {
                        this.field5394[var6] = var7;
                        this.field5399[var6] = new int[var8.field3622];
                        int var9 = 0;
                        if (var4) {
                           this.field5399[var6][var9] = arg0.method685(-2);
                           ++var9;
                        }

                        while(~var9 > ~var8.field3622) {
                           this.field5399[var6][var9] = arg0.method685(-2);
                           ++var9;
                        }

                        ++var6;
                     }
                  } while(~var6 > ~var5);
               }

               if (!var4) {
                  break label95;
               }
            }

            int var10 = arg0.method665(false);
            this.field5404 = new int[var10];
            int var11 = 0;
            if (var4 || ~var10 < ~var11) {
               do {
                  this.field5404[var11] = arg0.method685(class607.method4473(arg1, -4));
                  ++var11;
               } while(~var10 < ~var11);
            }
         }

         if (arg1 != 2) {
            this.field5394 = null;
         }

         ++field5402;
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field5416[10] + (arg0 != null ? field5416[2] : field5416[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IBI)I"
   )
   public final int method2875(int arg0, byte arg1, int arg2) {
      try {
         ++field5405;
         if (arg1 < 58) {
            method2866(79);
         }

         if (this.field5394 != null && arg0 >= 0 && ~arg0 >= ~this.field5394.length) {
            return this.field5399[arg0] != null && ~arg2 <= -1 && ~arg2 >= ~this.field5399[arg0].length ? this.field5399[arg0][arg2] : -1;
         } else {
            return -1;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5416[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2876(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2877(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
