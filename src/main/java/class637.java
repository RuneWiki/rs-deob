import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class637 extends class213 {
   @OriginalMember(
      owner = "client!raa",
      name = "I",
      descriptor = "I"
   )
   private int field8996 = 1;
   @OriginalMember(
      owner = "client!raa",
      name = "N",
      descriptor = "I"
   )
   private int field9000 = 1;
   @OriginalMember(
      owner = "client!raa",
      name = "E",
      descriptor = "I"
   )
   private int field9004 = 204;
   @OriginalMember(
      owner = "client!raa",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9006 = new String[]{method4625(method4624("\u0019-\\3 C")), method4625(method4624("\u00059Qq")), method4625(method4624("\u0010b\u00133\u001c")), method4625(method4624("\u0019-\\3$C")), method4625(method4624("W I#")), method4625(method4624("W+I#")), method4625(method4624("\u0019-\\3#C")), method4625(method4624("\u0019-\\3&C")), method4625(method4624("\u0019-\\3\"C")), method4625(method4624("\u0019-\\3%C"))};
   @OriginalMember(
      owner = "client!raa",
      name = "L",
      descriptor = "Lbga;"
   )
   public static class378 field9005 = new class378(31, -2);
   @OriginalMember(
      owner = "client!raa",
      name = "M",
      descriptor = "I"
   )
   public static int field8997;
   @OriginalMember(
      owner = "client!raa",
      name = "O",
      descriptor = "I"
   )
   public static int field8998;
   @OriginalMember(
      owner = "client!raa",
      name = "K",
      descriptor = "I"
   )
   public static int field8999;
   @OriginalMember(
      owner = "client!raa",
      name = "J",
      descriptor = "I"
   )
   public static int field9001;
   @OriginalMember(
      owner = "client!raa",
      name = "G",
      descriptor = "I"
   )
   public static int field9002;
   @OriginalMember(
      owner = "client!raa",
      name = "D",
      descriptor = "J"
   )
   public static long field9003;

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
   )
   public static final String method4620(String arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field8999;
         int var3 = arg0.length();
         int var4 = 0;
         int var5 = 0;
         if (var2) {
            char var6 = arg0.charAt(var5);
            if (~var6 != -61) {
               if (~var6 == -63) {
                  var4 += 3;
               }
            } else {
               var4 += 3;
            }

            ++var5;
         }

         while(true) {
            int var12;
            if (var5 >= var3) {
               var12 = -9 % ((arg1 - 18) / 41);
               StringBuffer var7 = new StringBuffer(var3 + var4);
               int var8 = 0;
               if (!var2) {
                  String var10000;
                  if (var2) {
                     var10000 = arg0;
                  } else if (~var8 <= ~var3) {
                     var10000 = var7.toString();
                     if (!var2) {
                        return var10000;
                     }
                  } else {
                     var10000 = arg0;
                  }

                  while(true) {
                     char var9 = var10000.charAt(var8);
                     if (var9 == '<') {
                        var7.append(field9006[4]);
                        if (var2) {
                           if (var9 == '>') {
                              var7.append(field9006[5]);
                              if (var2) {
                                 var7.append(var9);
                                 ++var8;
                              } else {
                                 ++var8;
                              }
                           } else {
                              var7.append(var9);
                              ++var8;
                           }
                        } else {
                           ++var8;
                        }
                     } else if (var9 == '>') {
                        var7.append(field9006[5]);
                        if (var2) {
                           var7.append(var9);
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        var7.append(var9);
                        ++var8;
                     }

                     if (~var8 <= ~var3) {
                        var10000 = var7.toString();
                        if (!var2) {
                           return var10000;
                        }
                     } else {
                        var10000 = arg0;
                     }
                  }
               }
            } else {
               var12 = arg0.charAt(var5);
            }

            if (~var12 != -61) {
               if (~var12 == -63) {
                  var4 += 3;
               }
            } else {
               var4 += 3;
            }

            ++var5;
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field9006[6] + (arg0 != null ? field9006[2] : field9006[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method4621(boolean arg0) {
      try {
         field9005 = null;
         if (!arg0) {
            method4623((byte[])null, -13);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9006[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "<init>",
      descriptor = "()V"
   )
   public class637() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(Lha;II)Ljk;"
   )
   public static final class663 method4622(class65 arg0, int arg1, int arg2) {
      try {
         ++field9001;
         if (arg1 != -63) {
            field9003 = 7L;
         }

         class686 var3 = class283.method2157(true, arg0, arg2, (byte)31);
         return var3 == null ? null : var3.field10068;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9006[8] + (arg0 != null ? field9006[2] : field9006[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         int var4 = -42 % ((68 - arg1) / 48);
         ++field9002;
         if (~arg2 != -1) {
            if (arg2 == 1) {
               this.field9000 = arg0.method4288((byte)110);
               return;
            }

            if (arg2 != 2) {
               return;
            }

            if (!client.field4273) {
               this.field9004 = arg0.method4280(-19104);
               return;
            }
         }

         this.field8996 = arg0.method4288((byte)74);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9006[7] + (arg0 != null ? field9006[2] : field9006[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "([BI)[B"
   )
   public static final byte[] method4623(byte[] arg0, int arg1) {
      try {
         if (arg1 != 9258) {
            return null;
         } else {
            ++field8997;
            class594 var2 = new class594(arg0);
            int var3 = var2.method4288((byte)68);
            int var4 = var2.method4302(true);
            if (~var4 > -1 || class334.field4786 != 0 && ~class334.field4786 > ~var4) {
               throw new RuntimeException();
            } else if (var3 == 0) {
               byte[] var5 = new byte[var4];
               var2.method4276(var5, var4, 0, 0);
               return var5;
            } else {
               int var6 = var2.method4302(true);
               if (~var6 <= -1 && (~class334.field4786 == -1 || var6 <= class334.field4786)) {
                  byte[] var7 = new byte[var6];
                  if (~var3 != -2) {
                     class211 var8 = class132.field1689;
                     synchronized(class132.field1689) {
                        class132.field1689.method1609(14911, var7, var2);
                     }
                  } else {
                     class113.method982(var7, var6, arg0, var4, 9);
                  }

                  return var7;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field9006[3] + (arg0 != null ? field9006[2] : field9006[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field8998;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int var5 = 0;
            if (var3 || var5 < class576.field7916) {
               do {
                  int var6 = class534.field7301[var5];
                  int var7 = class551.field7586[arg0];
                  int var8 = this.field8996 * var6 >> 12;
                  int var9 = this.field9000 * var7 >> 12;
                  int var10 = var6 % (4096 / this.field8996) * this.field8996;
                  int var11 = var7 % (4096 / this.field9000) * this.field9000;
                  if (~var11 > ~this.field9004) {
                     var8 -= var9;
                     if (var3) {
                        var8 += 4;
                     }

                     while(~var8 > -1) {
                        var8 += 4;
                     }

                     if (var3) {
                        var8 -= 4;
                     }

                     while(~var8 < -4) {
                        var8 -= 4;
                     }

                     if (var8 != 1) {
                        var4[var5] = 0;
                        if (!var3) {
                           ++var5;
                           continue;
                        }
                     }

                     if (this.field9004 > var10) {
                        var4[var5] = 0;
                        if (!var3) {
                           ++var5;
                           continue;
                        }
                     }
                  }

                  if (var10 >= this.field9004) {
                     var4[var5] = 4096;
                     ++var5;
                  } else {
                     int var12 = var8 - var9;
                     if (var3) {
                        var12 += 4;
                     }

                     while(~var12 > -1) {
                        var12 += 4;
                     }

                     if (var3) {
                        var12 -= 4;
                     }

                     while(~var12 < -4) {
                        var12 -= 4;
                     }

                     if (var12 > 0) {
                        var4[var5] = 0;
                        if (var3) {
                           var4[var5] = 4096;
                           ++var5;
                        } else {
                           ++var5;
                        }
                     } else {
                        var4[var5] = 4096;
                        ++var5;
                     }
                  }
               } while(var5 < class576.field7916);
            }
         }

         if (arg1 != 2064866508) {
            field9003 = -96L;
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field9006[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4624(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4625(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
