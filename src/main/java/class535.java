import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class535 extends class15 {
   @OriginalMember(
      owner = "client!vs",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7849 = new String[]{method4070(method4069("mXe\u001e")), method4070(method4069("x\u0003'\\n")), method4070(method4069("u^'5;")), method4070(method4069("u^'0;")), method4070(method4069("u^'1;")), method4070(method4069("u^'7;")), method4070(method4069("u^'6;")), method4070(method4069("u^'3;")), method4070(method4069("u^'4;"))};
   @OriginalMember(
      owner = "client!vs",
      name = "A",
      descriptor = "Laka;"
   )
   public static class418 field7845 = new class418(61, -2);
   @OriginalMember(
      owner = "client!vs",
      name = "G",
      descriptor = "F"
   )
   public static float field7848;
   @OriginalMember(
      owner = "client!vs",
      name = "t",
      descriptor = "I"
   )
   public static int field7834;
   @OriginalMember(
      owner = "client!vs",
      name = "w",
      descriptor = "I"
   )
   public static int field7836;
   @OriginalMember(
      owner = "client!vs",
      name = "B",
      descriptor = "I"
   )
   public static int field7839;
   @OriginalMember(
      owner = "client!vs",
      name = "F",
      descriptor = "I"
   )
   public static int field7842;
   @OriginalMember(
      owner = "client!vs",
      name = "u",
      descriptor = "I"
   )
   public static int field7844;
   @OriginalMember(
      owner = "client!vs",
      name = "x",
      descriptor = "I"
   )
   public static int field7846;
   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "I"
   )
   public static int field7847;
   @OriginalMember(
      owner = "client!vs",
      name = "E",
      descriptor = "Ljava/lang/String;"
   )
   public String field7843;
   @OriginalMember(
      owner = "client!vs",
      name = "s",
      descriptor = "[C"
   )
   public char[] field7835;
   @OriginalMember(
      owner = "client!vs",
      name = "C",
      descriptor = "[C"
   )
   public char[] field7837;
   @OriginalMember(
      owner = "client!vs",
      name = "v",
      descriptor = "[I"
   )
   public int[] field7838;
   @OriginalMember(
      owner = "client!vs",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field7840;
   @OriginalMember(
      owner = "client!vs",
      name = "y",
      descriptor = "[I"
   )
   public int[] field7841;

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4062(byte arg0) {
      try {
         field7840 = null;
         int var1 = 35 / ((arg0 - 6) / 63);
         field7845 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7849[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method4063(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         ++field7839;
         if (this.field7841 != null) {
            int var3 = 0;
            if (var2 || ~var3 > ~this.field7841.length) {
               do {
                  this.field7841[var3] = class2.method15(this.field7841[var3], 32768);
                  ++var3;
               } while(~var3 > ~this.field7841.length);
            }
         }

         if (this.field7838 != null) {
            int var4 = 0;
            if (var2 || this.field7838.length > var4) {
               do {
                  this.field7838[var4] = class2.method15(this.field7838[var4], 32768);
                  ++var4;
               } while(this.field7838.length > var4);
            }
         }

         if (arg0) {
            this.method4067(-67, (class66)null);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7849[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(BI)[B"
   )
   public static final byte[] method4064(byte arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field7847;
         if (arg0 != 101) {
            field7845 = null;
         }

         class385 var3 = (class385)class111.field1486.method2947((long)arg1, 28581);
         if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long)arg1);
            int var6 = 0;
            if (var2) {
               var4[var6] = (byte)var6;
               ++var6;
            }

            while(true) {
               while(~var6 > -256) {
                  var4[var6] = (byte)var6;
                  ++var6;
               }

               int var7 = 0;
               if (!var2) {
                  if (var2 || ~var7 > -256) {
                     do {
                        int var8 = -var7 + 255;
                        int var9 = class145.method1178(arg0 + 5632, var8, var5);
                        byte var10 = var4[var9];
                        var4[var9] = var4[var8];
                        var4[var8] = var4[-var7 + 511] = var10;
                        ++var7;
                     } while(~var7 > -256);
                  }

                  var3 = new class385(var4);
                  class111.field1486.method2946(var3, true, (long)arg1);
                  break;
               }

               ++var6;
            }
         }

         return var3.field5334;
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field7849[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(CB)I"
   )
   public final int method4065(char arg0, byte arg1) {
      boolean var3 = client.field1481;

      try {
         ++field7834;
         if (this.field7838 == null) {
            return -1;
         } else {
            if (arg1 < 41) {
               this.method4063(true);
            }

            int var4 = 0;
            if (var3) {
               if (this.field7837[var4] == arg0) {
                  return this.field7838[var4];
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (this.field7838.length <= var4) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = this.field7837[var4];
               }

               if (var10000 == arg0) {
                  return this.field7838[var4];
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7849[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(CI)I"
   )
   public final int method4066(char arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field7844;
         if (this.field7841 == null) {
            return -1;
         } else {
            if (arg1 != -1) {
               field7848 = -0.37581918F;
            }

            int var4 = 0;
            if (var3) {
               if (this.field7835[var4] == arg0) {
                  return this.field7841[var4];
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (var4 >= this.field7841.length) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = this.field7835[var4];
               }

               if (var10000 == arg0) {
                  return this.field7841[var4];
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7849[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method4067(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 != 0) {
            this.field7835 = null;
         }

         ++field7842;

         do {
            int var4 = arg1.method640(255);
            if (var4 == 0) {
               break;
            }

            this.method4068(var4, false, arg1);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7849[6] + arg0 + ',' + (arg1 != null ? field7849[1] : field7849[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(IZLgea;)V"
   )
   private final void method4068(int arg0, boolean arg1, class66 arg2) {
      boolean var4 = client.field1481;

      try {
         label99: {
            if (arg0 != 1) {
               if (~arg0 != -3) {
                  label108: {
                     if (~arg0 != -4) {
                        break label99;
                     }

                     int var5 = arg2.method640(255);
                     this.field7835 = new char[var5];
                     this.field7841 = new int[var5];
                     int var6 = 0;
                     if (var4) {
                        this.field7841[var6] = arg2.method603(-2);
                     } else if (var6 >= var5) {
                        if (!var4) {
                           if (!var4) {
                              break label99;
                           }
                           break label108;
                        }
                     } else {
                        this.field7841[var6] = arg2.method603(-2);
                     }

                     while(true) {
                        byte var7 = arg2.method628((byte)-12);
                        this.field7835[var6] = ~var7 == -1 ? 0 : class123.method1076(var7, -25094);
                        ++var6;
                        if (var6 >= var5) {
                           if (!var4) {
                              if (!var4) {
                                 break label99;
                              }
                              break;
                           }
                        } else {
                           this.field7841[var6] = arg2.method603(-2);
                        }
                     }
                  }
               }

               label71: {
                  int var8 = arg2.method640(255);
                  this.field7838 = new int[var8];
                  this.field7837 = new char[var8];
                  int var9 = 0;
                  if (var4) {
                     this.field7838[var9] = arg2.method603(-2);
                  } else if (var8 <= var9) {
                     if (!var4) {
                        break label71;
                     }
                  } else {
                     this.field7838[var9] = arg2.method603(-2);
                  }

                  while(true) {
                     byte var10 = arg2.method628((byte)-12);
                     this.field7837[var9] = ~var10 != -1 ? class123.method1076(var10, -25094) : 0;
                     ++var9;
                     if (var8 <= var9) {
                        if (!var4) {
                           break;
                        }
                     } else {
                        this.field7838[var9] = arg2.method603(-2);
                     }
                  }
               }

               if (!var4) {
                  break label99;
               }
            }

            this.field7843 = arg2.method606(11856);
         }

         if (arg1) {
            this.field7843 = null;
         }

         ++field7846;
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field7849[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7849[1] : field7849[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4069(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4070(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
