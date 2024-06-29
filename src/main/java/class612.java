import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class612 {
   @OriginalMember(
      owner = "client!eba",
      name = "k",
      descriptor = "I"
   )
   public int field8878 = -1;
   @OriginalMember(
      owner = "client!eba",
      name = "c",
      descriptor = "I"
   )
   public int field8882 = 64;
   @OriginalMember(
      owner = "client!eba",
      name = "o",
      descriptor = "I"
   )
   public int field8877 = -1;
   @OriginalMember(
      owner = "client!eba",
      name = "r",
      descriptor = "I"
   )
   public int field8879 = 512;
   @OriginalMember(
      owner = "client!eba",
      name = "b",
      descriptor = "I"
   )
   public int field8876 = 127;
   @OriginalMember(
      owner = "client!eba",
      name = "j",
      descriptor = "I"
   )
   public int field8880 = 1190717;
   @OriginalMember(
      owner = "client!eba",
      name = "e",
      descriptor = "I"
   )
   public int field8884 = 0;
   @OriginalMember(
      owner = "client!eba",
      name = "s",
      descriptor = "Z"
   )
   public boolean field8883 = false;
   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "Z"
   )
   public boolean field8889 = true;
   @OriginalMember(
      owner = "client!eba",
      name = "p",
      descriptor = "I"
   )
   public int field8892 = 8;
   @OriginalMember(
      owner = "client!eba",
      name = "m",
      descriptor = "Z"
   )
   public boolean field8894 = true;
   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8895 = new String[]{method4500(method4499("\u001a\u0019EHLW")), method4500(method4499("\u0004U\nHt")), method4500(method4499("\u0011\u000eH\n")), method4500(method4499("\u001a\u0019EHMW")), method4500(method4499("\u001a\u0019EHOW")), method4500(method4499("\u001a\u0019EHHW")), method4500(method4499("\u001a\u0019EHKW"))};
   @OriginalMember(
      owner = "client!eba",
      name = "q",
      descriptor = "Lgh;"
   )
   public static class572 field8893 = new class572(123, -2);
   @OriginalMember(
      owner = "client!eba",
      name = "d",
      descriptor = "I"
   )
   public static int field8881;
   @OriginalMember(
      owner = "client!eba",
      name = "g",
      descriptor = "I"
   )
   public int field8886;
   @OriginalMember(
      owner = "client!eba",
      name = "l",
      descriptor = "I"
   )
   public static int field8887;
   @OriginalMember(
      owner = "client!eba",
      name = "f",
      descriptor = "I"
   )
   public static int field8888;
   @OriginalMember(
      owner = "client!eba",
      name = "h",
      descriptor = "I"
   )
   public static int field8890;
   @OriginalMember(
      owner = "client!eba",
      name = "i",
      descriptor = "I"
   )
   public static int field8891;
   @OriginalMember(
      owner = "client!eba",
      name = "n",
      descriptor = "Lod;"
   )
   public class530 field8885;

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4493(int arg0) {
      try {
         if (arg0 != 4) {
            method4493(115);
         }

         field8893 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8895[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4494(int arg0) {
      try {
         if (arg0 != 5) {
            method4493(57);
         }

         this.field8892 = this.field8892 << 8 | this.field8886;
         ++field8890;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8895[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(IIZI)I"
   )
   public static final int method4495(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         ++field8891;
         int var6 = arg3 & 3;
         if (var6 == 0) {
            return arg1;
         } else {
            if (arg2) {
               field8893 = null;
            }

            if (~var6 == -2) {
               return arg0;
            } else {
               return var6 == 2 ? -arg1 + 4095 : 4095 - arg0;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8895[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(ILuda;)V"
   )
   public final void method4496(int arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg0 >= -26) {
            method4493(40);
         }

         ++field8881;

         do {
            int var4 = arg1.method3564((byte)-75);
            if (var4 == 0) {
               break;
            }

            this.method4497(var4, 105, arg1);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8895[3] + arg0 + ',' + (arg1 != null ? field8895[1] : field8895[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(IILuda;)V"
   )
   private final void method4497(int arg0, int arg1, class473 arg2) {
      boolean var4 = client.field4564;

      try {
         label109: {
            if (~arg0 != -2) {
               if (~arg0 != -3) {
                  if (~arg0 != -4) {
                     if (arg0 == 5) {
                        this.field8894 = false;
                        if (!var4) {
                           break label109;
                        }
                     }

                     if (~arg0 != -8) {
                        if (~arg0 != -9) {
                           if (~arg0 != -10) {
                              if (arg0 == 10) {
                                 this.field8889 = false;
                                 if (!var4) {
                                    break label109;
                                 }
                              }

                              if (~arg0 != -12) {
                                 if (arg0 != 12) {
                                    if (arg0 == 13) {
                                       this.field8880 = arg2.method3577(-2);
                                       if (!var4) {
                                          break label109;
                                       }
                                    }

                                    if (arg0 != 14) {
                                       if (~arg0 != -17) {
                                          break label109;
                                       }

                                       this.field8876 = arg2.method3564((byte)-121);
                                       if (!var4) {
                                          break label109;
                                       }
                                    }

                                    this.field8882 = arg2.method3564((byte)-99) << 2;
                                    if (!var4) {
                                       break label109;
                                    }
                                 }

                                 this.field8883 = true;
                                 if (!var4) {
                                    break label109;
                                 }
                              }

                              this.field8892 = arg2.method3564((byte)-109);
                              if (!var4) {
                                 break label109;
                              }
                           }

                           this.field8879 = arg2.method3565(true) << 2;
                           if (!var4) {
                              break label109;
                           }
                        }

                        this.field8885.field7717 = this.field8886;
                        if (!var4) {
                           break label109;
                        }
                     }

                     this.field8878 = class263.method2105(arg2.method3577(-2), (byte)90);
                     if (!var4) {
                        break label109;
                     }
                  }

                  this.field8877 = arg2.method3565(true);
                  if (~this.field8877 != -65536) {
                     break label109;
                  }

                  this.field8877 = -1;
                  if (!var4) {
                     break label109;
                  }
               }

               this.field8877 = arg2.method3564((byte)-78);
               if (!var4) {
                  break label109;
               }
            }

            this.field8884 = class263.method2105(arg2.method3577(-2), (byte)120);
         }

         ++field8887;
         int var5 = -109 % ((-6 - arg1) / 51);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8895[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8895[1] : field8895[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4498(int arg0, int arg1) {
      class192 var2 = null;

      for(int var3 = arg0; var3 < arg1; ++var3) {
         class293 var4 = class530.field7721[var3];
         if (var4 != null) {
            for(int var5 = 0; var5 < class357.field5100; ++var5) {
               for(int var6 = 0; var6 < class479.field6989; ++var6) {
                  var2 = var4.method2286(var6, var5, var2);
                  if (var2 != null) {
                     int var7 = var6 << class76.field1336;
                     int var8 = var5 << class76.field1336;

                     for(int var9 = var3 - 1; var9 >= 0; --var9) {
                        class293 var10 = class530.field7721[var9];
                        if (var10 != null) {
                           int var11 = var4.method2289(var6, var5, (byte)127) - var10.method2289(var6, var5, (byte)124);
                           int var12 = var4.method2289(var6 + 1, var5, (byte)118) - var10.method2289(var6 + 1, var5, (byte)119);
                           int var13 = var4.method2289(var6 + 1, var5 + 1, (byte)127) - var10.method2289(var6 + 1, var5 + 1, (byte)116);
                           int var14 = var4.method2289(var6, var5 + 1, (byte)123) - var10.method2289(var6, var5 + 1, (byte)109);
                           var10.method2285(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4499(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4500(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
