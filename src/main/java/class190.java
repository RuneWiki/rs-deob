import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class190 {
   @OriginalMember(
      owner = "client!ika",
      name = "l",
      descriptor = "B"
   )
   public byte field2954;
   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2963 = new String[]{method1697(method1696("\u0001yq\u0018")), method1697(method1696("\u0006g|Z?G")), method1697(method1696("\u0014\"3Z\u0001")), method1697(method1696("\u0006g|Z=G")), method1697(method1696("\u0006g|Z>G")), method1697(method1696("\u0006g|Z9G")), method1697(method1696("\u0006g|Z8G")), method1697(method1696("\u0006g|Z@\u0006bt\u0000BG"))};
   @OriginalMember(
      owner = "client!ika",
      name = "c",
      descriptor = "I"
   )
   public static int field2944;
   @OriginalMember(
      owner = "client!ika",
      name = "m",
      descriptor = "I"
   )
   public static int field2945;
   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "I"
   )
   public static int field2946;
   @OriginalMember(
      owner = "client!ika",
      name = "d",
      descriptor = "I"
   )
   public static int field2947;
   @OriginalMember(
      owner = "client!ika",
      name = "k",
      descriptor = "I"
   )
   public static int field2948;
   @OriginalMember(
      owner = "client!ika",
      name = "p",
      descriptor = "Lika;"
   )
   public class190 field2959;
   @OriginalMember(
      owner = "client!ika",
      name = "i",
      descriptor = "Lmja;"
   )
   public class269 field2955;
   @OriginalMember(
      owner = "client!ika",
      name = "n",
      descriptor = "Lmja;"
   )
   public class269 field2960;
   @OriginalMember(
      owner = "client!ika",
      name = "h",
      descriptor = "Lnc;"
   )
   public class462 field2952;
   @OriginalMember(
      owner = "client!ika",
      name = "t",
      descriptor = "Lbm;"
   )
   public class484 field2951;
   @OriginalMember(
      owner = "client!ika",
      name = "e",
      descriptor = "Lbm;"
   )
   public class484 field2953;
   @OriginalMember(
      owner = "client!ika",
      name = "o",
      descriptor = "Lija;"
   )
   public class605 field2962;
   @OriginalMember(
      owner = "client!ika",
      name = "r",
      descriptor = "Lcu;"
   )
   public class667 field2961;
   @OriginalMember(
      owner = "client!ika",
      name = "q",
      descriptor = "S"
   )
   public short field2950;
   @OriginalMember(
      owner = "client!ika",
      name = "s",
      descriptor = "S"
   )
   public short field2956;
   @OriginalMember(
      owner = "client!ika",
      name = "f",
      descriptor = "S"
   )
   public short field2957;
   @OriginalMember(
      owner = "client!ika",
      name = "g",
      descriptor = "S"
   )
   public short field2958;
   @OriginalMember(
      owner = "client!ika",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field2943;
   @OriginalMember(
      owner = "client!ika",
      name = "b",
      descriptor = "[Ls;"
   )
   public static class271[] field2949;

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(Lha;Z)V"
   )
   public static final void method1691(class610 arg0, boolean arg1) {
      try {
         label27: {
            ++field2945;
            if (class485.field7378) {
               class23.method169(arg0, false);
               if (!client.field1786) {
                  break label27;
               }
            }

            class214.method1867((byte)102, arg0);
         }

         if (arg1) {
            field2947 = 55;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2963[1] + (arg0 != null ? field2963[2] : field2963[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1692(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2944;
         if (arg0 > -38) {
            method1695((byte)-28);
            if (!var2 && this.field2962 == null) {
               return;
            }
         } else if (this.field2962 == null) {
            return;
         }

         do {
            class605 var3 = this.field2962.field8840;
            this.field2962.method4468((byte)83);
            this.field2962 = var3;
         } while(this.field2962 != null);

      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2963[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method1693(byte arg0) {
      boolean var1 = client.field1786;

      try {
         ++field2946;
         class767.method5606(-21362, (long)class308.field4801, class351.field5356);
         if (class288.field4539 != -1) {
            class462.method3587(class288.field4539, (byte)-120);
         }

         int var2 = 0;
         int var3 = 103 / ((arg0 - -46) / 43);
         if (var1) {
            if (class721.field10798[var2]) {
               class730.field10897[var2] = true;
            }

            class12.field158[var2] = class721.field10798[var2];
            class721.field10798[var2] = false;
            ++var2;
         }

         while(true) {
            int var10000;
            if (class169.field2594 <= var2) {
               class771.field11354 = class308.field4801;
               var10000 = class288.field4539;
               if (!var1) {
                  if (var10000 != -1) {
                     class169.field2594 = 0;
                     class335.method2735(0);
                  }

                  class351.field5356.method701();
                  class286.method2387((byte)57, class351.field5356);
                  int var4 = class162.method1443(-117);
                  if (var4 == -1) {
                     var4 = class436.field6683;
                  }

                  if (~var4 == 0) {
                     var4 = class91.field1315;
                  }

                  class296.method2488(var4, -1);
                  class359.field5557 = 0;
                  return;
               }
            } else {
               var10000 = class721.field10798[var2];
            }

            if (var10000 != 0) {
               class730.field10897[var2] = true;
            }

            class12.field158[var2] = class721.field10798[var2];
            class721.field10798[var2] = false;
            ++var2;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2963[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method1694(int arg0, boolean arg1) {
      boolean var2 = client.field1786;

      try {
         ++field2948;
         ++class750.field11118;
         class577 var3 = class218.method1888(class718.field10766, 125, class510.field7801.field361);
         class510.field7801.method211(var3, 122);
         if (arg0 != -1) {
            field2947 = 55;
         }

         class276 var4 = (class276)class507.field7766.method3139(124);
         if (var2) {
            if (!var4.method2478(1001)) {
               var4 = (class276)class507.field7766.method3139(115);
               if (var4 == null && !var2 && !var2) {
                  if (class387.field6083 != null) {
                     class573.method4310((byte)-90, class387.field6083);
                     class387.field6083 = null;
                     return;
                  }

                  return;
               }
            }

            if (~var4.field4406 == -1) {
               class741.method5443(-1, var4, arg1, true);
            }

            var4 = (class276)class507.field7766.method3147(-21068);
         }

         while(true) {
            while(var4 != null) {
               if (!var4.method2478(1001)) {
                  var4 = (class276)class507.field7766.method3139(115);
                  if (var4 == null && !var2 && !var2) {
                     if (class387.field6083 != null) {
                        class573.method4310((byte)-90, class387.field6083);
                        class387.field6083 = null;
                        return;
                     }

                     return;
                  }
               }

               if (~var4.field4406 == -1) {
                  class741.method5443(-1, var4, arg1, true);
               }

               var4 = (class276)class507.field7766.method3147(-21068);
            }

            if (!var2) {
               if (class387.field6083 != null) {
                  class573.method4310((byte)-90, class387.field6083);
                  class387.field6083 = null;
                  return;
               }

               return;
            }

            if (~var4.field4406 == -1) {
               class741.method5443(-1, var4, arg1, true);
            }

            var4 = (class276)class507.field7766.method3147(-21068);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2963[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class190(int arg0) {
      try {
         this.field2954 = (byte)arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2963[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1695(byte arg0) {
      try {
         if (arg0 < 77) {
            field2949 = null;
         }

         field2943 = null;
         field2949 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2963[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1696(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1697(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
