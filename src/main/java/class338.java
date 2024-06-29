import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class338 implements Runnable {
   @OriginalMember(
      owner = "client!ne",
      name = "g",
      descriptor = "Lhha;"
   )
   private class549 field4843;
   @OriginalMember(
      owner = "client!ne",
      name = "q",
      descriptor = "Z"
   )
   private boolean field4847;
   @OriginalMember(
      owner = "client!ne",
      name = "j",
      descriptor = "I"
   )
   public int field4849;
   @OriginalMember(
      owner = "client!ne",
      name = "i",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field4848;
   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4851 = new String[]{method2686(method2685("5G[0z")), method2686(method2685("5W\u0019\u0014")), method2686(method2685(" \f[V/")), method2686(method2685("5G[>z")), method2686(method2685("5G[;z")), method2686(method2685("5G[?z")), method2686(method2685("5G[D;5K\u0001Fz")), method2686(method2685("5G[:z")), method2686(method2685("5G[\n'5\n")), method2686(method2685("5G[=z")), method2686(method2685("5G[<z")), method2686(method2685("5G[9z"))};
   @OriginalMember(
      owner = "client!ne",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field4833 = new int[32];
   @OriginalMember(
      owner = "client!ne",
      name = "k",
      descriptor = "I"
   )
   public static int field4839 = 0;
   @OriginalMember(
      owner = "client!ne",
      name = "b",
      descriptor = "I"
   )
   public static int field4834;
   @OriginalMember(
      owner = "client!ne",
      name = "c",
      descriptor = "I"
   )
   public static int field4835;
   @OriginalMember(
      owner = "client!ne",
      name = "d",
      descriptor = "I"
   )
   public static int field4836;
   @OriginalMember(
      owner = "client!ne",
      name = "h",
      descriptor = "I"
   )
   public static int field4837;
   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "I"
   )
   public static int field4840;
   @OriginalMember(
      owner = "client!ne",
      name = "l",
      descriptor = "I"
   )
   public static int field4841;
   @OriginalMember(
      owner = "client!ne",
      name = "p",
      descriptor = "I"
   )
   public static int field4842;
   @OriginalMember(
      owner = "client!ne",
      name = "n",
      descriptor = "I"
   )
   public static int field4844;
   @OriginalMember(
      owner = "client!ne",
      name = "r",
      descriptor = "I"
   )
   public static int field4845;
   @OriginalMember(
      owner = "client!ne",
      name = "f",
      descriptor = "I"
   )
   public static int field4850;
   @OriginalMember(
      owner = "client!ne",
      name = "o",
      descriptor = "Lkh;"
   )
   public static class17 field4846;
   @OriginalMember(
      owner = "client!ne",
      name = "m",
      descriptor = "Lha;"
   )
   public static class65 field4832;
   @OriginalMember(
      owner = "client!ne",
      name = "e",
      descriptor = "Lbo;"
   )
   public static class763 field4838;

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(ILgia;)V"
   )
   private final void method2677(int arg0, class284 arg1) {
      try {
         ++field4850;
         class549 var3 = this.field4843;
         synchronized(this.field4843) {
            this.field4843.method3968(arg1, (byte)-68);
            ++this.field4849;
            this.field4843.notifyAll();
            if (arg0 != -32390) {
               field4837 = -90;
            }

         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4851[5] + arg0 + ',' + (arg1 != null ? field4851[2] : field4851[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2678(byte arg0) {
      try {
         field4838 = null;
         field4846 = null;
         if (arg0 > -72) {
            field4832 = null;
         }

         field4832 = null;
         field4833 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4851[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(Ltt;II)Lgia;"
   )
   public final class284 method2679(class100 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2680(int arg0) {
      try {
         ++field4836;
         if (arg0 != -19693) {
            this.field4847 = false;
         }

         this.field4847 = true;
         class549 var2 = this.field4843;
         synchronized(this.field4843) {
            this.field4843.notifyAll();
         }

         try {
            this.field4848.join();
         } catch (InterruptedException var4) {
         }

         this.field4848 = null;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4851[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(ILtt;I)Lgia;"
   )
   public final class284 method2681(int arg0, class100 arg1, int arg2) {
      try {
         ++field4842;
         class284 var4 = new class284();
         var4.field10818 = false;
         var4.field7452 = (long)arg0;
         var4.field3781 = arg1;
         if (arg2 != 5) {
            method2683(65, (String)null, false, true);
         }

         var4.field3778 = 3;
         this.method2677(-32390, var4);
         return var4;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4851[10] + arg0 + ',' + (arg1 != null ? field4851[2] : field4851[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(Laka;B)V"
   )
   public static final void method2682(class85 arg0, byte arg1) {
      boolean var2 = client.field4273;

      try {
         ++field4835;
         if (arg1 < -96) {
            arg0.method3943(-4);
            boolean var3 = false;
            class85 var4 = (class85)class193.field2360.method3964((byte)113);
            boolean var10000;
            if (var2) {
               var10000 = class270.method2065(var4.method831(-20699), arg0.method831(-20699), (byte)118);
            } else if (var4 == null) {
               var10000 = var3;
               if (!var2) {
                  if (!var3) {
                     class193.field2360.method3968(arg0, (byte)107);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = class270.method2065(var4.method831(-20699), arg0.method831(-20699), (byte)118);
            }

            do {
               while(true) {
                  if (var10000) {
                     class518.method3756(arg0, var4, 1);
                     var3 = true;
                     if (!var2) {
                        var10000 = var3;
                        break;
                     }

                     var4 = (class85)class193.field2360.method3965(true);
                  } else {
                     var4 = (class85)class193.field2360.method3965(true);
                  }

                  if (var4 == null) {
                     var10000 = var3;
                     if (!var2) {
                        if (!var3) {
                           class193.field2360.method3968(arg0, (byte)107);
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = class270.method2065(var4.method831(-20699), arg0.method831(-20699), (byte)118);
                  }
               }
            } while(var2);

            if (!var3) {
               class193.field2360.method3968(arg0, (byte)107);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4851[3] + (arg0 != null ? field4851[2] : field4851[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(ILjava/lang/String;ZZ)V"
   )
   public static final void method2683(int arg0, String arg1, boolean arg2, boolean arg3) {
      boolean var4 = client.field4273;

      try {
         label256: {
            class174.method1353(-91);
            ++field4834;
            if (arg0 == 0) {
               field4832 = class459.method3377(class674.field9907.field8429.method1211((byte)-85) * 2, class226.field2842, class204.field2515, -79, 0, class368.field5178);
               if (arg1 == null) {
                  break label256;
               }

               field4832.method589(0);
               class663 var5 = class572.method4117(class194.field2365, 0, class167.field2112, (byte)84);
               class66 var6 = field4832.method496(var5, class267.method2055(class354.field5051, class167.field2112, 0), true);
               class194.method1460((byte)5);
               class134.method1128(arg1, false, var6, var5, field4832, true);
               if (!var4) {
                  break label256;
               }
            }

            class65 var7 = null;
            if (arg1 != null) {
               var7 = class459.method3377(0, class226.field2842, class204.field2515, -86, 0, class368.field5178);
               var7.method589(0);
               class663 var8 = class572.method4117(class194.field2365, 0, class167.field2112, (byte)84);
               class66 var9 = var7.method496(var8, class267.method2055(class354.field5051, class167.field2112, 0), true);
               class194.method1460((byte)5);
               class134.method1128(arg1, false, var9, var8, var7, true);
            }

            boolean var27 = false;

            label257: {
               try {
                  var27 = true;
                  field4832 = class459.method3377(class674.field9907.field8429.method1211((byte)-83) * 2, class226.field2842, class204.field2515, -99, arg0, class368.field5178);
                  if (arg1 != null) {
                     var7.method589(0);
                     class663 var10 = class572.method4117(class194.field2365, 0, class167.field2112, (byte)84);
                     class66 var11 = var7.method496(var10, class267.method2055(class354.field5051, class167.field2112, 0), true);
                     class194.method1460((byte)5);
                     class134.method1128(arg1, false, var11, var10, var7, true);
                  }

                  if (field4832.method498()) {
                     boolean var12 = true;

                     try {
                        var12 = ~class334.field4792.field10589 < -257;
                     } catch (Throwable var31) {
                     }

                     class438 var13;
                     label236: {
                        if (!var12) {
                           var13 = field4832.method576(104857600);
                           if (!var4) {
                              break label236;
                           }
                        }

                        var13 = field4832.method576(146800640);
                     }

                     field4832.method586(var13);
                     var27 = false;
                  } else {
                     var27 = false;
                  }
                  break label257;
               } catch (Throwable var32) {
                  int var14 = class674.field9907.field8451.method2770((byte)-111);
                  if (~var14 == -3) {
                     class595.field8291 = true;
                  }

                  class674.field9907.method4407(class674.field9907.field8451, -2160, 0);
                  method2683(var14, arg1, true, arg3);
                  Object var10000 = null;
                  var27 = false;
               } finally {
                  if (var27) {
                     Object var19 = null;
                     if (var7 != null) {
                        try {
                           var7.method559(-10565);
                        } catch (Throwable var28) {
                        }
                     }

                  }
               }

               if (var7 != null) {
                  try {
                     var7.method559(-10565);
                  } catch (Throwable var29) {
                  }
               }

               return;
            }

            Object var18 = null;
            if (var7 != null) {
               try {
                  var7.method559(-10565);
               } catch (Throwable var30) {
               }
            }
         }

         class674.field9907.field8451.method2773(!arg3, -63);
         class674.field9907.method4407(class674.field9907.field8451, -2160, arg0);
         class299.method2252(-2386);
         field4832.method491(10000);
         field4832.method533(32);
         class92.field1230 = field4832.method603();
         class88.field1124 = field4832.method603();
         class535.method3852((byte)-65);
         field4832.method594(~class674.field9907.field8466.method5028((byte)-63) == -2);
         if (field4832.method512()) {
            class292.method2195(~class674.field9907.field8469.method4189((byte)-128) == -2, -95);
         }

         class758.method5452(class215.field2667 >> 3, class507.field7030 >> 3, 95, field4832);
         class300.method2261(15966);
         class429.field5979 = false;
         class550.field7516 = null;
         class343.field4915 = arg2;
         class773.method5531(-3023);
      } catch (RuntimeException var34) {
         throw class534.method3846(var34, field4851[0] + arg0 + ',' + (arg1 != null ? field4851[2] : field4851[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(II[BLtt;)Lgia;"
   )
   public final class284 method2684(int arg0, int arg1, byte[] arg2, class100 arg3) {
      try {
         ++field4845;
         class284 var5 = new class284();
         var5.field10818 = false;
         int var6 = -18 / (arg0 / 47);
         var5.field3782 = arg2;
         var5.field3781 = arg3;
         var5.field3778 = 2;
         var5.field7452 = (long)arg1;
         this.method2677(-32390, var5);
         return var5;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4851[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4851[2] : field4851[1]) + ',' + (arg3 != null ? field4851[2] : field4851[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "<init>",
      descriptor = "(Lbj;)V"
   )
   public class338(class255 arg0) {
      boolean var2 = client.field4273;
      super();
      this.field4843 = new class549();
      this.field4847 = false;
      this.field4849 = 0;

      try {
         class289 var3 = arg0.method1956(this, -128, 5);
         if (var2) {
            class173.method1347(-105, 10L);
         }

         while(true) {
            int var10000;
            if (~var3.field3826 != -1) {
               var10000 = var3.field3826;
               if (!var2) {
                  if (var10000 == 2) {
                     throw new RuntimeException();
                  }

                  this.field4848 = (Thread)var3.field3830;
                  return;
               }
            } else {
               var10000 = -105;
            }

            class173.method1347(var10000, 10L);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4851[6] + (arg0 != null ? field4851[2] : field4851[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2685(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2686(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
