import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class596 implements class261 {
   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "Lf;"
   )
   private class790 field8771;
   @OriginalMember(
      owner = "client!hj",
      name = "l",
      descriptor = "Lkf;"
   )
   private class266 field8768;
   @OriginalMember(
      owner = "client!hj",
      name = "j",
      descriptor = "Lkf;"
   )
   private class266 field8760;
   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8772 = new String[]{method4335(method4334("\b&\u0002\u0011R")), method4335(method4334("\b&\u0002n\u0013\u000e%XlR")), method4335(method4334("\u000e9@>")), method4335(method4334("\u001bb\u0002|\u0007")), method4335(method4334("\b&\u0002\u001aR")), method4335(method4334("\b&\u0002\u0016R")), method4335(method4334("\b&\u0002\u0014R")), method4335(method4334("\b&\u0002\u0017R")), method4335(method4334("\b&\u0002\u0013R")), method4335(method4334("\b&\u0002\u001bR")), method4335(method4334("\b&\u0002\u0010R")), method4335(method4334("\b&\u0002\u0015R"))};
   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field8762 = false;
   @OriginalMember(
      owner = "client!hj",
      name = "k",
      descriptor = "I"
   )
   public static int field8763 = -2;
   @OriginalMember(
      owner = "client!hj",
      name = "f",
      descriptor = "I"
   )
   public static int field8757;
   @OriginalMember(
      owner = "client!hj",
      name = "g",
      descriptor = "I"
   )
   public static int field8758;
   @OriginalMember(
      owner = "client!hj",
      name = "h",
      descriptor = "I"
   )
   public static int field8759;
   @OriginalMember(
      owner = "client!hj",
      name = "m",
      descriptor = "I"
   )
   public static int field8761;
   @OriginalMember(
      owner = "client!hj",
      name = "o",
      descriptor = "I"
   )
   public static int field8764;
   @OriginalMember(
      owner = "client!hj",
      name = "i",
      descriptor = "I"
   )
   public static int field8765;
   @OriginalMember(
      owner = "client!hj",
      name = "d",
      descriptor = "I"
   )
   public static int field8766;
   @OriginalMember(
      owner = "client!hj",
      name = "c",
      descriptor = "I"
   )
   public static int field8767;
   @OriginalMember(
      owner = "client!hj",
      name = "e",
      descriptor = "I"
   )
   public static int field8770;
   @OriginalMember(
      owner = "client!hj",
      name = "n",
      descriptor = "Lda;"
   )
   private class67 field8769;

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(BZ)V",
      line = 4
   )
   public final void method861(byte arg0, boolean arg1) {
      try {
         int var3 = -28 / ((-31 - arg0) / 44);
         if (arg1) {
            int var4 = this.field8771.field11587.method1384(this.field8771.field11590, (byte)-118, class87.field1142) - -this.field8771.field11599;
            int var5 = this.field8771.field11586.method1414(this.field8771.field11591, 92, class60.field743) - -this.field8771.field11598;
            this.field8769.method626(this.field8771.field11588, var5, this.field8771.field11590, this.field8771.field11591, 0, (class515)null, this.field8771.field11594, (int[])null, this.field8771.field11585, var4, 0, this.field8771.field11593, 0, this.field8771.field11582, (class492[])null, this.field8771.field11584);
         }

         ++field8766;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8772[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(II)V",
      line = 23
   )
   public static final void method4328(int arg0, int arg1) {
      try {
         if (arg0 == 0) {
            ++field8767;
            class755 var2 = class317.method2325((long)arg1, arg0 ^ 105, 11);
            var2.method5481(-88);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8772[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(B)V",
      line = 43
   )
   public static final void method4329(byte arg0) {
      boolean var1 = client.field4360;

      try {
         class182.method1447(0, class383.field5543, (long)class96.field1234);
         ++field8770;
         if (class185.field2623 != -1) {
            class454.method3315(class185.field2623, false);
         }

         int var2 = 0;
         if (var1) {
            if (class188.field2673[var2]) {
               class301.field4123[var2] = true;
            }

            class299.field4092[var2] = class188.field2673[var2];
            class188.field2673[var2] = false;
            ++var2;
         }

         while(true) {
            int var10000;
            if (~class425.field6085 >= ~var2) {
               class355.field4783 = class96.field1234;
               var10000 = class185.field2623;
               if (!var1) {
                  if (var10000 != -1) {
                     class425.field6085 = 0;
                     class621.method4519((byte)125);
                  }

                  class383.field5543.method574();
                  class365.method2723(class383.field5543, true);
                  int var3 = class119.method949(0);
                  if (var3 == -1) {
                     var3 = class146.field1843;
                  }

                  if (arg0 != -36) {
                     field8763 = 127;
                  }

                  if (~var3 == 0) {
                     var3 = class450.field6386;
                  }

                  class277.method2105(var3, 120);
                  class294.field4045 = 0;
                  return;
               }
            } else {
               var10000 = class188.field2673[var2];
            }

            if (var10000 != 0) {
               class301.field4123[var2] = true;
            }

            class299.field4092[var2] = class188.field2673[var2];
            class188.field2673[var2] = false;
            ++var2;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8772[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(ILlia;I[I)V",
      line = 92
   )
   public static final void method4330(int arg0, class506 arg1, int arg2, int[] arg3) {
      boolean var4 = client.field4360;

      try {
         ++field8765;
         if (arg1.field3816 != null) {
            int var10000;
            label163: {
               byte var5 = 1;
               int var6 = 0;
               if (var4) {
                  var10000 = arg1.field3816[var6];
               } else if (var6 >= arg1.field3816.length) {
                  var10000 = var5;
                  if (!var4) {
                     break label163;
                  }
               } else {
                  var10000 = arg1.field3816[var6];
               }

               label162:
               do {
                  while(true) {
                     if (var10000 != arg3[var6]) {
                        var5 = 0;
                        if (!var4) {
                           var10000 = var5;
                           break;
                        }

                        ++var6;
                     } else {
                        ++var6;
                     }

                     if (var6 >= arg1.field3816.length) {
                        var10000 = var5;
                        if (!var4) {
                           break label162;
                        }
                     } else {
                        var10000 = arg1.field3816[var6];
                     }
                  }
               } while(var4);
            }

            if (var10000 != 0 && ~arg1.field3866 != 0) {
               class85 var7 = class190.field2702.method4411(arg1.field3866, 108);
               int var8 = var7.field1106;
               if (var8 == 1) {
                  arg1.field3813 = arg0;
                  arg1.field3874 = 0;
                  arg1.field3821 = 1;
                  arg1.field3827 = 0;
                  arg1.field3804 = 0;
                  if (!arg1.field3801) {
                     class478.method3485(arg1.field3804, var7, 734475305, arg1);
                  }
               }

               if (var8 == 2) {
                  arg1.field3827 = 0;
               }
            }
         }

         if (arg2 == -1) {
            boolean var9 = true;
            int var10 = 0;
            if (var4) {
               if (~arg3[var10] != 0) {
                  var9 = false;
               }
            } else if (~var10 <= ~arg3.length) {
               if (!var4) {
                  if (var9) {
                     arg1.field3813 = arg0;
                     arg1.field3886 = arg1.field3891;
                     arg1.field3816 = arg3;
                     return;
                  }

                  return;
               }

               if (var9) {
                  var9 = false;
               }
            } else if (~arg3[var10] != 0) {
               var9 = false;
            }

            while(true) {
               if (arg1.field3816 != null) {
                  if (~arg1.field3816[var10] != 0) {
                     if (class190.field2702.method4411(arg3[var10], 119).field1107 >= class190.field2702.method4411(arg1.field3816[var10], 92).field1107) {
                        arg1.field3816 = arg3;
                        arg1.field3886 = arg1.field3891;
                        arg1.field3813 = arg0;
                        ++var10;
                     } else {
                        ++var10;
                     }
                  } else {
                     arg1.field3816 = arg3;
                     arg1.field3886 = arg1.field3891;
                     arg1.field3813 = arg0;
                     ++var10;
                  }
               } else {
                  arg1.field3816 = arg3;
                  arg1.field3886 = arg1.field3891;
                  arg1.field3813 = arg0;
                  ++var10;
               }

               if (~var10 <= ~arg3.length) {
                  if (!var4) {
                     if (var9) {
                        arg1.field3813 = arg0;
                        arg1.field3886 = arg1.field3891;
                        arg1.field3816 = arg3;
                        return;
                     }

                     return;
                  }

                  if (var9) {
                     var9 = false;
                  }
               } else if (~arg3[var10] != 0) {
                  var9 = false;
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field8772[11] + arg0 + ',' + (arg1 != null ? field8772[3] : field8772[2]) + ',' + arg2 + ',' + (arg3 != null ? field8772[3] : field8772[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "(I)Z",
      line = 182
   )
   public final boolean method860(int arg0) {
      try {
         ++field8757;
         boolean var2 = true;
         if (!this.field8760.method2051(this.field8771.field11589, (byte)60)) {
            var2 = false;
         }

         if (arg0 != 9201) {
            return true;
         } else {
            if (!this.field8768.method2051(this.field8771.field11589, (byte)60)) {
               var2 = false;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8772[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(I)V",
      line = 205
   )
   public final void method862(int arg0) {
      try {
         ++field8764;
         if (arg0 != -23681) {
            method4330(-50, (class506)null, -57, (int[])null);
         }

         class206 var2 = class73.method674(this.field8771.field11589, this.field8768, (byte)103);
         this.field8769 = class383.field5543.method502(var2, class439.method3232(this.field8760, this.field8771.field11589), true);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8772[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(IB)Z",
      line = 222
   )
   public static final boolean method4331(int arg0, byte arg1) {
      try {
         int var2 = -86 % ((arg1 - -35) / 40);
         ++field8759;
         return ~arg0 == -10 || ~arg0 == -11;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8772[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "(II)I",
      line = 232
   )
   public static final int method4332(int arg0, int arg1) {
      try {
         ++field8761;
         if (arg1 != 6409) {
            method4331(-83, (byte)-93);
         }

         if (~arg0 != -6407) {
            if (arg0 == 6409) {
               return 1;
            } else if (~arg0 != -32842) {
               if (~arg0 == -6411) {
                  return 2;
               } else if (arg0 != 6407) {
                  if (~arg0 == -6409) {
                     return 4;
                  } else {
                     throw new IllegalArgumentException("");
                  }
               } else {
                  return 3;
               }
            } else {
               return 1;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8772[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(ILjava/lang/String;)I",
      line = 267
   )
   public static final int method4333(int arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field8758;
         if (arg1 == null) {
            return -1;
         } else {
            int var3 = arg0;
            if (var2) {
               if (arg1.equalsIgnoreCase(class581.field8554[arg0])) {
                  return arg0;
               }

               var3 = arg0 + 1;
            }

            while(true) {
               while(~class710.field10360 < ~var3) {
                  if (arg1.equalsIgnoreCase(class581.field8554[var3])) {
                     return var3;
                  }

                  ++var3;
               }

               if (!var2) {
                  return -1;
               }

               if (-1 != 0) {
                  return var3;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8772[6] + arg0 + ',' + (arg1 != null ? field8772[3] : field8772[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "<init>",
      descriptor = "(Lkf;Lkf;Lf;)V",
      line = 301
   )
   public class596(class266 arg0, class266 arg1, class790 arg2) {
      try {
         this.field8771 = arg2;
         this.field8768 = arg1;
         this.field8760 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8772[1] + (arg0 != null ? field8772[3] : field8772[2]) + ',' + (arg1 != null ? field8772[3] : field8772[2]) + ',' + (arg2 != null ? field8772[3] : field8772[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4334(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4335(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
