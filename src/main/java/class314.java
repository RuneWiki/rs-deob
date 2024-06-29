import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class314 extends class97 implements class77 {
   @OriginalMember(
      owner = "client!w",
      name = "g",
      descriptor = "I"
   )
   private int field4516;
   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4521 = new String[]{method2439(method2438("\\]")), method2439(method2438("^\u001f~z")), method2439(method2438("\\\\")), method2439(method2438("^\u001fyz")), method2439(method2438("^\u001f\u007fz")), method2439(method2438("^\u001f|z")), method2439(method2438("^\u001f{z")), method2439(method2438("GDT>")), method2439(method2438("R\u001f\u0016|\u0006")), method2439(method2438("^\u001f\u0004;\u0015@E\u0006z")), method2439(method2438("^\u001f}z")), method2439(method2438("^\u001fzz")), method2439(method2438("^\u001fpz"))};
   @OriginalMember(
      owner = "client!w",
      name = "j",
      descriptor = "I"
   )
   public static int field4512;
   @OriginalMember(
      owner = "client!w",
      name = "h",
      descriptor = "I"
   )
   public static int field4513;
   @OriginalMember(
      owner = "client!w",
      name = "f",
      descriptor = "I"
   )
   public static int field4514;
   @OriginalMember(
      owner = "client!w",
      name = "k",
      descriptor = "I"
   )
   public static int field4515;
   @OriginalMember(
      owner = "client!w",
      name = "d",
      descriptor = "I"
   )
   public static int field4517;
   @OriginalMember(
      owner = "client!w",
      name = "c",
      descriptor = "I"
   )
   public static int field4518;
   @OriginalMember(
      owner = "client!w",
      name = "i",
      descriptor = "I"
   )
   public static int field4519;
   @OriginalMember(
      owner = "client!w",
      name = "e",
      descriptor = "I"
   )
   public static int field4520;

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "([BIII)V",
      line = 3
   )
   public final void method797(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         this.method926(arg0, arg2);
         ++field4517;
         if (arg3 != 14180) {
            this.field4516 = -3;
         }

         this.field4516 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4521[6] + (arg0 != null ? field4521[8] : field4521[7]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "b",
      descriptor = "(B)V",
      line = 16
   )
   public static final void method2434(byte arg0) {
      try {
         int var1 = -82 % ((-46 - arg0) / 48);
         ++field4512;
         class149.method1391(57);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4521[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(Z)J",
      line = 27
   )
   public final long method796(boolean arg0) {
      try {
         if (arg0) {
            this.field4516 = -69;
         }

         ++field4520;
         return super.field1548.getAddress();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4521[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "<init>",
      descriptor = "(Lrk;I[BI)V",
      line = 38
   )
   public class314(class35 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field4516 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4521[9] + (arg0 != null ? field4521[8] : field4521[7]) + ',' + arg1 + ',' + (arg2 != null ? field4521[8] : field4521[7]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(ILuda;)Lkga;",
      line = 46
   )
   public static final class569 method2435(int arg0, class473 arg1) {
      try {
         ++field4515;
         int var2 = arg1.method3564((byte)-100);
         class678 var3 = class405.method3115(86)[arg1.method3564((byte)-107)];
         class112 var4 = class213.method1811(false)[arg1.method3564((byte)-111)];
         int var5 = arg1.method3538(-128);
         int var6 = arg1.method3538(arg0 ^ -127);
         int var7 = arg1.method3565(true);
         int var8 = arg1.method3565(true);
         int var9 = arg1.method3567(arg0 ^ 31870);
         int var10 = arg1.method3567(31871);
         int var11 = arg1.method3567(31871);
         boolean var12 = arg1.method3564((byte)-48) == arg0;
         return new class569(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field4521[10] + arg0 + ',' + (arg1 != null ? field4521[8] : field4521[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(I)I",
      line = 77
   )
   public final int method795(int arg0) {
      try {
         ++field4513;
         if (arg0 != 6854) {
            this.field4516 = -117;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4521[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "b",
      descriptor = "(Z)V",
      line = 88
   )
   public static final void method2436(boolean arg0) {
      try {
         class486.field7067.method1589((byte)43);
         if (arg0) {
            method2435(-9, (class473)null);
         }

         ++field4514;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4521[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "b",
      descriptor = "(I)V",
      line = 99
   )
   public static final void method2437(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field4518;
         class124.field2049 = 0;
         int var2 = class346.field4923.method3588(65280);
         int var3 = class346.field4923.method3539(125);
         int var4 = ~class346.field4923.method3564((byte)-49) != -2 ? 0 : 1;
         int var5 = class346.field4923.method3564((byte)-69);
         class443.method3333((byte)-28);
         class22.method155((byte)-42, var5);
         int var6 = (-class346.field4923.field6907 + class650.field9423) / 16;
         class487.field7079 = new int[var6][4];
         int var7 = 0;
         int var8;
         int var9;
         int var10;
         int var11;
         int var10000;
         int var10001;
         int var10002;
         if (var1) {
            var8 = 0;
            if (var1) {
               class487.field7079[var7][var8] = class346.field4923.method3567(31871);
               ++var8;
            }
         } else {
            if (var7 >= var6) {
               class756.field10978 = new byte[var6][];
               class213.field3183 = new int[var6];
               class245.field3526 = new byte[var6][];
               class205.field3058 = new int[var6];
               class719.field10376 = new byte[var6][];
               var10000 = arg0;
               if (!var1) {
                  if (arg0 <= 117) {
                     return;
                  }

                  class629.field9178 = null;
                  class733.field10553 = new int[var6];
                  class131.field2180 = new int[var6];
                  class631.field9200 = new int[var6];
                  class360.field5391 = new byte[var6][];
                  class64.field1171 = null;
                  var9 = 0;
                  var10 = (var2 - (class209.field3112 >> 4)) / 8;
                  if (var1) {
                     var10000 = var3;
                     var10001 = class1.field3;
                     var10002 = 1024055908;
                  } else if (((class209.field3112 >> 4) + var2) / 8 < var10) {
                     var10000 = var4;
                     var10001 = 11;
                     var10002 = 0;
                     if (!var1) {
                        class668.method4882((boolean)var4, 11, 0, var2, var3);
                        return;
                     }
                  } else {
                     var10000 = var3;
                     var10001 = class1.field3;
                     var10002 = 1024055908;
                  }

                  while(true) {
                     var11 = (var10000 + -(var10001 >> var10002)) / 8;
                     if (var1) {
                        class733.field10553[var9] = (var10 << 8) + var11;
                        class205.field3058[var9] = class515.field7506.method1329(-1, "m" + var10 + "_" + var11);
                        class213.field3183[var9] = class515.field7506.method1329(-1, "l" + var10 + "_" + var11);
                        class131.field2180[var9] = class515.field7506.method1329(-1, field4521[2] + var10 + "_" + var11);
                        class631.field9200[var9] = class515.field7506.method1329(-1, field4521[0] + var10 + "_" + var11);
                        ++var9;
                        ++var11;
                     }

                     while(true) {
                        while(var11 <= (var3 - -(class1.field3 >> 4)) / 8) {
                           class733.field10553[var9] = (var10 << 8) + var11;
                           class205.field3058[var9] = class515.field7506.method1329(-1, "m" + var10 + "_" + var11);
                           class213.field3183[var9] = class515.field7506.method1329(-1, "l" + var10 + "_" + var11);
                           class131.field2180[var9] = class515.field7506.method1329(-1, field4521[2] + var10 + "_" + var11);
                           class631.field9200[var9] = class515.field7506.method1329(-1, field4521[0] + var10 + "_" + var11);
                           ++var9;
                           ++var11;
                        }

                        if (!var1) {
                           ++var10;
                           if (((class209.field3112 >> 4) + var2) / 8 < var10) {
                              var10000 = var4;
                              var10001 = 11;
                              var10002 = 0;
                              if (!var1) {
                                 class668.method4882((boolean)var4, 11, 0, var2, var3);
                                 return;
                              }
                           } else {
                              var10000 = var3;
                              var10001 = class1.field3;
                              var10002 = 1024055908;
                           }
                           break;
                        }

                        ++var11;
                     }
                  }
               }
            } else {
               var10000 = 0;
            }

            var8 = var10000;
            if (var1) {
               class487.field7079[var7][var8] = class346.field4923.method3567(31871);
               ++var8;
            }
         }

         while(true) {
            while(var8 < 4) {
               class487.field7079[var7][var8] = class346.field4923.method3567(31871);
               ++var8;
            }

            if (!var1) {
               ++var7;
               if (var7 >= var6) {
                  class756.field10978 = new byte[var6][];
                  class213.field3183 = new int[var6];
                  class245.field3526 = new byte[var6][];
                  class205.field3058 = new int[var6];
                  class719.field10376 = new byte[var6][];
                  var10000 = arg0;
                  if (!var1) {
                     if (arg0 <= 117) {
                        return;
                     }

                     class629.field9178 = null;
                     class733.field10553 = new int[var6];
                     class131.field2180 = new int[var6];
                     class631.field9200 = new int[var6];
                     class360.field5391 = new byte[var6][];
                     class64.field1171 = null;
                     var9 = 0;
                     var10 = (var2 - (class209.field3112 >> 4)) / 8;
                     if (var1) {
                        var10000 = var3;
                        var10001 = class1.field3;
                        var10002 = 1024055908;
                     } else if (((class209.field3112 >> 4) + var2) / 8 < var10) {
                        var10000 = var4;
                        var10001 = 11;
                        var10002 = 0;
                        if (!var1) {
                           class668.method4882((boolean)var4, 11, 0, var2, var3);
                           return;
                        }
                     } else {
                        var10000 = var3;
                        var10001 = class1.field3;
                        var10002 = 1024055908;
                     }

                     while(true) {
                        var11 = (var10000 + -(var10001 >> var10002)) / 8;
                        if (var1) {
                           class733.field10553[var9] = (var10 << 8) + var11;
                           class205.field3058[var9] = class515.field7506.method1329(-1, "m" + var10 + "_" + var11);
                           class213.field3183[var9] = class515.field7506.method1329(-1, "l" + var10 + "_" + var11);
                           class131.field2180[var9] = class515.field7506.method1329(-1, field4521[2] + var10 + "_" + var11);
                           class631.field9200[var9] = class515.field7506.method1329(-1, field4521[0] + var10 + "_" + var11);
                           ++var9;
                           ++var11;
                        }

                        while(true) {
                           while(var11 <= (var3 - -(class1.field3 >> 4)) / 8) {
                              class733.field10553[var9] = (var10 << 8) + var11;
                              class205.field3058[var9] = class515.field7506.method1329(-1, "m" + var10 + "_" + var11);
                              class213.field3183[var9] = class515.field7506.method1329(-1, "l" + var10 + "_" + var11);
                              class131.field2180[var9] = class515.field7506.method1329(-1, field4521[2] + var10 + "_" + var11);
                              class631.field9200[var9] = class515.field7506.method1329(-1, field4521[0] + var10 + "_" + var11);
                              ++var9;
                              ++var11;
                           }

                           if (!var1) {
                              ++var10;
                              if (((class209.field3112 >> 4) + var2) / 8 < var10) {
                                 var10000 = var4;
                                 var10001 = 11;
                                 var10002 = 0;
                                 if (!var1) {
                                    class668.method4882((boolean)var4, 11, 0, var2, var3);
                                    return;
                                 }
                              } else {
                                 var10000 = var3;
                                 var10001 = class1.field3;
                                 var10002 = 1024055908;
                              }
                              break;
                           }

                           ++var11;
                        }
                     }
                  }
               } else {
                  var10000 = 0;
               }

               var8 = var10000;
               if (var1) {
                  class487.field7079[var7][var8] = class346.field4923.method3567(31871);
                  ++var8;
               }
            } else {
               ++var8;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field4521[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "<init>",
      descriptor = "(Lrk;ILjaclib/memory/Buffer;)V",
      line = 177
   )
   public class314(class35 arg0, int arg1, Buffer arg2) {
      super(arg0, arg2);

      try {
         this.field4516 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4521[9] + (arg0 != null ? field4521[8] : field4521[7]) + ',' + arg1 + ',' + (arg2 != null ? field4521[8] : field4521[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(B)I",
      line = 186
   )
   public final int method794(byte arg0) {
      try {
         if (arg0 < 57) {
            this.field4516 = -3;
         }

         ++field4519;
         return this.field4516;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4521[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2438(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2439(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
