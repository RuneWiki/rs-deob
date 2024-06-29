import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class284 {
   @OriginalMember(
      owner = "client!kg",
      name = "d",
      descriptor = "F"
   )
   public float field3984;
   @OriginalMember(
      owner = "client!kg",
      name = "c",
      descriptor = "F"
   )
   public float field3983;
   @OriginalMember(
      owner = "client!kg",
      name = "h",
      descriptor = "F"
   )
   public float field3993;
   @OriginalMember(
      owner = "client!kg",
      name = "i",
      descriptor = "F"
   )
   public float field3994;
   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "I"
   )
   public int field3997;
   @OriginalMember(
      owner = "client!kg",
      name = "n",
      descriptor = "I"
   )
   public int field3989;
   @OriginalMember(
      owner = "client!kg",
      name = "q",
      descriptor = "F"
   )
   public float field3992;
   @OriginalMember(
      owner = "client!kg",
      name = "l",
      descriptor = "F"
   )
   public float field3986;
   @OriginalMember(
      owner = "client!kg",
      name = "e",
      descriptor = "Luaa;"
   )
   public class126 field3988;
   @OriginalMember(
      owner = "client!kg",
      name = "k",
      descriptor = "I"
   )
   public int field3990;
   @OriginalMember(
      owner = "client!kg",
      name = "m",
      descriptor = "I"
   )
   public int field3995;
   @OriginalMember(
      owner = "client!kg",
      name = "f",
      descriptor = "I"
   )
   public int field3996;
   @OriginalMember(
      owner = "client!kg",
      name = "j",
      descriptor = "I"
   )
   public int field3987;
   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4001 = new String[]{method2174(method2173("@e2\u00044Ekh\u0006u")), method2174(method2173("EwpT")), method2174(method2173("P,2\u0016 ")), method2174(method2173("@e2}u")), method2174(method2173("@e2{u")), method2174(method2173("@e2yu")), method2174(method2173("@e2|u")), method2174(method2173("@e2zu"))};
   @OriginalMember(
      owner = "client!kg",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field3998 = new int[500];
   @OriginalMember(
      owner = "client!kg",
      name = "p",
      descriptor = "I"
   )
   public static int field3985;
   @OriginalMember(
      owner = "client!kg",
      name = "o",
      descriptor = "I"
   )
   public static int field3991;
   @OriginalMember(
      owner = "client!kg",
      name = "r",
      descriptor = "I"
   )
   public static int field3999;
   @OriginalMember(
      owner = "client!kg",
      name = "g",
      descriptor = "I"
   )
   public static int field4000;

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(ILkg;)Z"
   )
   public final boolean method2167(int arg0, class284 arg1) {
      try {
         if (arg0 != 128) {
            this.field3989 = 59;
         }

         ++field3985;
         return this.field3989 == arg1.field3989 && this.field3994 == arg1.field3994 && this.field3986 == arg1.field3986 && this.field3992 == arg1.field3992 && this.field3993 == arg1.field3993 && this.field3984 == arg1.field3984 && this.field3983 == arg1.field3983 && this.field3995 == arg1.field3995 && ~this.field3996 == ~arg1.field3996 && this.field3988 == arg1.field3988;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4001[5] + arg0 + ',' + (arg1 != null ? field4001[2] : field4001[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2168(byte arg0) {
      try {
         field3998 = null;
         if (arg0 < 116) {
            field3998 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4001[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(IIIILha;BI)Lka;"
   )
   public static final class497 method2169(int arg0, int arg1, int arg2, int arg3, class66 arg4, byte arg5, int arg6) {
      try {
         ++field3999;
         long var7 = (long)arg1;
         class497 var9 = (class497)class434.field6616.method5454(var7, 18261);
         short var10 = 2055;
         if (var9 == null) {
            class134 var11 = class307.method2325(arg5 ^ -94, arg1, 0, class551.field8148);
            if (var11 == null) {
               return null;
            }

            if (var11.field1704 < 13) {
               var11.method1142(2, -124);
            }

            var9 = arg4.method547(var11, var10, class15.field187, 64, 768);
            class434.field6616.method5455(-2049, var9, var7);
         }

         if (arg5 != -94) {
            return null;
         } else {
            class497 var12 = var9.method343((byte)2, var10, true);
            if (arg6 != 0) {
               var12.method316(arg6);
            }

            if (arg2 != 0) {
               var12.method340(arg2);
            }

            if (~arg3 != -1) {
               var12.method310(arg3);
            }

            if (~arg0 != -1) {
               var12.method303(0, arg0, 0);
            }

            return var12;
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field4001[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4001[2] : field4001[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "<init>",
      descriptor = "()V"
   )
   public class284() {
      this.field3984 = 1.0F;
      this.field3983 = 1.0F;
      this.field3993 = 0.25F;

      try {
         this.field3994 = 1.1523438F;
         this.field3997 = -50;
         this.field3989 = class695.field10438;
         this.field3992 = 1.2F;
         this.field3986 = 0.69921875F;
         this.field3988 = class787.field11445;
         this.field3990 = -60;
         this.field3995 = class429.field6549;
         this.field3996 = 0;
         this.field3987 = -50;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4001[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(Ljj;I)V"
   )
   public final void method2170(class128 arg0, int arg1) {
      try {
         this.field3984 = (float)(8 * arg0.method1104(255)) / 255.0F;
         ++field3991;
         this.field3993 = (float)(arg1 * arg0.method1104(255)) / 255.0F;
         this.field3983 = (float)(8 * arg0.method1104(255)) / 255.0F;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4001[4] + (arg0 != null ? field4001[2] : field4001[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "<init>",
      descriptor = "(Ljj;)V"
   )
   public class284(class128 arg0) {
      int var2 = client.field4530;
      super();
      this.field3984 = 1.0F;
      this.field3983 = 1.0F;
      this.field3993 = 0.25F;

      try {
         int var3;
         label114: {
            var3 = arg0.method1104(255);
            if (~class261.field3566.field9431.method2469(100) == -2 && class459.field6944.method586() > 0) {
               label105: {
                  if (~(1 & var3) == -1) {
                     this.field3989 = class695.field10438;
                     if (var2 == 0) {
                        break label105;
                     }
                  }

                  this.field3989 = arg0.method1041(4758);
               }

               label100: {
                  if (~(var3 & 2) == -1) {
                     this.field3994 = 1.1523438F;
                     if (var2 == 0) {
                        break label100;
                     }
                  }

                  this.field3994 = (float)arg0.method1038((byte)-126) / 256.0F;
               }

               label95: {
                  if ((var3 & 4) != 0) {
                     this.field3986 = (float)arg0.method1038((byte)-113) / 256.0F;
                     if (var2 == 0) {
                        break label95;
                     }
                  }

                  this.field3986 = 0.69921875F;
               }

               if (~(8 & var3) != -1) {
                  this.field3992 = (float)arg0.method1038((byte)-121) / 256.0F;
                  if (var2 == 0) {
                     break label114;
                  }
               }

               this.field3992 = 1.2F;
               if (var2 == 0) {
                  break label114;
               }
            }

            if ((1 & var3) != 0) {
               arg0.method1041(4758);
            }

            if ((2 & var3) != 0) {
               arg0.method1038((byte)-94);
            }

            if ((var3 & 4) != 0) {
               arg0.method1038((byte)-116);
            }

            if ((8 & var3) != 0) {
               arg0.method1038((byte)-114);
            }

            this.field3986 = 0.69921875F;
            this.field3989 = class695.field10438;
            this.field3994 = 1.1523438F;
            this.field3992 = 1.2F;
         }

         label85: {
            if (~(var3 & 16) != -1) {
               this.field3997 = arg0.method1066(32767);
               this.field3990 = arg0.method1066(32767);
               this.field3987 = arg0.method1066(32767);
               if (var2 == 0) {
                  break label85;
               }
            }

            this.field3987 = -50;
            this.field3997 = -50;
            this.field3990 = -60;
         }

         label80: {
            if (~(var3 & 32) != -1) {
               this.field3995 = arg0.method1041(4758);
               if (var2 == 0) {
                  break label80;
               }
            }

            this.field3995 = class429.field6549;
         }

         label75: {
            if ((64 & var3) != 0) {
               this.field3996 = arg0.method1038((byte)-116);
               if (var2 == 0) {
                  break label75;
               }
            }

            this.field3996 = 0;
         }

         if (~(var3 & 128) == -1) {
            this.field3988 = class787.field11445;
         } else {
            int var4 = arg0.method1038((byte)-124);
            int var5 = arg0.method1038((byte)-98);
            int var6 = arg0.method1038((byte)-110);
            int var7 = arg0.method1038((byte)-103);
            int var8 = arg0.method1038((byte)-128);
            int var9 = arg0.method1038((byte)-120);
            this.field3988 = class209.method1593(var6, var7, var9, (byte)-70, var4, var8, var5);
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field4001[0] + (arg0 != null ? field4001[2] : field4001[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2171(int arg0) {
      try {
         ++field4000;
         class616.field9011.method550(class280.field3897);
         class616.field9011.method630(class778.field11363, class351.field5334, class145.field1826, class489.field7232);
         if (arg0 != 8) {
            method2169(25, 33, 75, 10, (class66)null, (byte)-107, -74);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4001[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method2172(boolean arg0) {
      if (arg0) {
         class353.field5360 = class91.field1171;
         class377.field5711 = class650.field9484;
      } else {
         class353.field5360 = class293.field4084;
         class377.field5711 = class147.field1843;
      }

      class424.field6437 = class353.field5360.length;
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2173(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2174(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
