import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class704 extends class754 {
   @OriginalMember(
      owner = "client!wca",
      name = "F",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field10261;
   @OriginalMember(
      owner = "client!wca",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10265 = new String[]{method5124(method5123("|<\u001a]")), method5124(method5123("e*\u0017\u001fx:")), method5124(method5123("igX\u001fA")), method5124(method5123("e*\u0017\u001f}:")), method5124(method5123("e*\u0017\u001f~:")), method5124(method5123("e*\u0017\u001f\u0000{'\u001fE\u0002:")), method5124(method5123("e*\u0017\u001f\u007f:")), method5124(method5123("e*\u0017\u001fy:"))};
   @OriginalMember(
      owner = "client!wca",
      name = "D",
      descriptor = "I"
   )
   public static int field10257;
   @OriginalMember(
      owner = "client!wca",
      name = "A",
      descriptor = "I"
   )
   public static int field10258;
   @OriginalMember(
      owner = "client!wca",
      name = "B",
      descriptor = "I"
   )
   public static int field10259;
   @OriginalMember(
      owner = "client!wca",
      name = "H",
      descriptor = "I"
   )
   public static int field10260;
   @OriginalMember(
      owner = "client!wca",
      name = "C",
      descriptor = "I"
   )
   public static int field10262;
   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "I"
   )
   public static int field10263;
   @OriginalMember(
      owner = "client!wca",
      name = "E",
      descriptor = "I"
   )
   public static int field10264;

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5120(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10257;
         if (arg1 > -69) {
            field10259 = 113;
         }

         int var5 = class611.field8871;
         if (var5 != 0) {
            if (var5 == 1) {
               class588.field8499 = arg3;
               class127.field2121 = arg0;
               class611.field8871 = 2;
               class348.field4946 = arg2;
               class684.field10070 = arg4;
               return;
            }

            if (var5 != 2) {
               return;
            }

            if (!client.field4564) {
               if (arg4 > class684.field10070) {
                  class684.field10070 = arg4;
               }

               if (~class127.field2121 < ~arg0) {
                  class127.field2121 = arg0;
               }

               if (~class588.field8499 > ~arg3) {
                  class588.field8499 = arg3;
               }

               if (class348.field4946 > arg2) {
                  class348.field4946 = arg2;
               }

               return;
            }
         }

      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10265[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method5121(boolean arg0) {
      boolean var1 = client.field4564;

      try {
         if (!arg0) {
            field10259 = 104;
         }

         int var2 = 0;
         int var10000;
         if (var1) {
            var10000 = class642.method4701((byte)97, class124.field2039, class504.field7338 + var2) * class547.field7911;
         } else if (class124.field2039 <= var2) {
            var10000 = field10258 + 1;
            if (!var1) {
               field10258 = var10000;
               return;
            }
         } else {
            var10000 = class642.method4701((byte)97, class124.field2039, class504.field7338 + var2) * class547.field7911;
         }

         while(true) {
            int var3 = var10000;
            int var4 = 0;
            if (var1 || class547.field7911 > var4) {
               do {
                  int var5 = class642.method4701((byte)57, class547.field7911, class663.field9648 + var4) + var3;
                  if (~class74.field1314[var5] == ~class618.field8980) {
                     class80.field1360[var5].method4465(0, 0, class438.field6324, class335.field4788, class438.field6324 * var4, class335.field4788 * var2, true, true);
                  }

                  ++var4;
               } while(class547.field7911 > var4);
            }

            ++var2;
            if (class124.field2039 <= var2) {
               var10000 = field10258 + 1;
               if (!var1) {
                  field10258 = var10000;
                  return;
               }
            } else {
               var10000 = class642.method4701((byte)97, class124.field2039, class504.field7338 + var2) * class547.field7911;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10265[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1865(int arg0) {
      try {
         int var2 = -87 % ((arg0 - 19) / 55);
         ++field10262;
         return false;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10265[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "b",
      descriptor = "(Z)Ljava/lang/Object;"
   )
   public final Object method1864(boolean arg0) {
      try {
         if (!arg0) {
            method5121(false);
         }

         ++field10263;
         return this.field10261;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10265[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "([IIIILcs;[I)Lol;"
   )
   public static final class298 method5122(int[] arg0, int arg1, int arg2, int arg3, class357 arg4, int[] arg5) {
      boolean var6 = client.field4564;

      try {
         if (arg3 != 0) {
            return null;
         } else {
            ++field10260;
            if (arg4.method1190(class776.field11354, -115, class209.field3106)) {
               byte[] var11 = new byte[arg1 * arg2];
               int var12 = 0;
               if (!var6 && ~arg1 >= ~var12) {
                  return new class298(arg4, arg2, arg1, var11);
               } else {
                  do {
                     int var13 = arg2 * var12 - -arg0[var12];
                     int var14 = 0;
                     if (var6) {
                        var11[var13++] = -1;
                        ++var14;
                     }

                     while(true) {
                        while(arg5[var12] > var14) {
                           var11[var13++] = -1;
                           ++var14;
                        }

                        if (!var6) {
                           ++var12;
                           break;
                        }

                        ++var14;
                     }
                  } while(~arg1 < ~var12);

                  return new class298(arg4, arg2, arg1, var11);
               }
            } else {
               int[] var7 = new int[arg1 * arg2];
               int var8 = 0;
               if (!var6 && ~arg1 >= ~var8) {
                  return new class298(arg4, arg2, arg1, var7);
               } else {
                  do {
                     int var9 = arg2 * var8 + arg0[var8];
                     int var10 = 0;
                     if (var6) {
                        var7[var9++] = -16777216;
                        ++var10;
                     }

                     while(true) {
                        while(arg5[var8] > var10) {
                           var7[var9++] = -16777216;
                           ++var10;
                        }

                        if (!var6) {
                           ++var8;
                           break;
                        }

                        ++var10;
                     }
                  } while(~arg1 < ~var8);

                  return new class298(arg4, arg2, arg1, var7);
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field10265[1] + (arg0 != null ? field10265[2] : field10265[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10265[2] : field10265[0]) + ',' + (arg5 != null ? field10265[2] : field10265[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class704(Object arg0, int arg1) {
      super(arg1);

      try {
         this.field10261 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10265[5] + (arg0 != null ? field10265[2] : field10265[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5123(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5124(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
