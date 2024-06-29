import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class206 {
   @OriginalMember(
      owner = "client!ru",
      name = "g",
      descriptor = "[B"
   )
   private byte[] field2947;
   @OriginalMember(
      owner = "client!ru",
      name = "p",
      descriptor = "[[B"
   )
   private byte[][] field2949;
   @OriginalMember(
      owner = "client!ru",
      name = "i",
      descriptor = "I"
   )
   public int field2950;
   @OriginalMember(
      owner = "client!ru",
      name = "c",
      descriptor = "I"
   )
   public int field2944;
   @OriginalMember(
      owner = "client!ru",
      name = "n",
      descriptor = "I"
   )
   public int field2956;
   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2958 = new String[]{method1641(method1640("q<4")), method1641(method1640("e ")), method1641(method1640("l6>2")), method1641(method1640(",zc")), method1641(method1640("l!!.")), method1641(method1640("k9*\u007f")), method1641(method1640("p!c\u0000U")), method1641(method1640("g!?-")), method1641(method1640("a;=;")), method1641(method1640("n ")), method1641(method1640("p1*")), method1641(method1640("yzcl\u0000")), method1641(method1640("v= '\u000e")), method1641(method1640("p!c\u0003U")), method1641(method1640("p!c\u0001U")), method1641(method1640("p!c\u0004U")), method1641(method1640("p!c\nU")), method1641(method1640("p!c\tU")), method1641(method1640("p!c~\u0014l=9|U")), method1641(method1640("p!c\u0006U")), method1641(method1640("p!c\u000bU")), method1641(method1640("p!c\bU")), method1641(method1640("`&")), method1641(method1640("p!c\u0007U")), method1641(method1640("p!c\u0005U"))};
   @OriginalMember(
      owner = "client!ru",
      name = "h",
      descriptor = "I"
   )
   public static int field2942;
   @OriginalMember(
      owner = "client!ru",
      name = "j",
      descriptor = "I"
   )
   public static int field2943;
   @OriginalMember(
      owner = "client!ru",
      name = "m",
      descriptor = "I"
   )
   public static int field2945;
   @OriginalMember(
      owner = "client!ru",
      name = "d",
      descriptor = "I"
   )
   public static int field2946;
   @OriginalMember(
      owner = "client!ru",
      name = "o",
      descriptor = "I"
   )
   public static int field2948;
   @OriginalMember(
      owner = "client!ru",
      name = "b",
      descriptor = "I"
   )
   public static int field2951;
   @OriginalMember(
      owner = "client!ru",
      name = "l",
      descriptor = "I"
   )
   public static int field2952;
   @OriginalMember(
      owner = "client!ru",
      name = "e",
      descriptor = "I"
   )
   public static int field2953;
   @OriginalMember(
      owner = "client!ru",
      name = "f",
      descriptor = "I"
   )
   public static int field2954;
   @OriginalMember(
      owner = "client!ru",
      name = "k",
      descriptor = "I"
   )
   public static int field2955;
   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "Liha;"
   )
   public static class32 field2957;

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(Z[Ljava/lang/String;[Lbg;Ljava/lang/String;[I)I",
      line = 6
   )
   public final int method1629(boolean param1, String[] param2, class492[] param3, String param4, int[] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(BLjava/lang/String;I[Lbg;)I",
      line = 256
   )
   public final int method1630(byte arg0, String arg1, int arg2, class492[] arg3) {
      boolean var5 = client.field4360;

      try {
         ++field2954;
         int var6 = this.method1629(false, class635.field9290, arg3, arg1, new int[]{arg2});
         int var7 = 0;
         int var8 = 0;
         int var9;
         if (var5) {
            var9 = this.method1639(arg3, class635.field9290[var8], 60);
            if (~var9 < ~var7) {
               var7 = var9;
            }

            ++var8;
         }

         while(true) {
            int var10000;
            if (~var6 >= ~var8) {
               var10000 = arg0;
               if (!var5) {
                  if (arg0 != -84) {
                     this.method1629(false, (String[])null, (class492[])null, (String)null, (int[])null);
                  }

                  return var7;
               }
            } else {
               var10000 = this.method1639(arg3, class635.field9290[var8], 60);
            }

            var9 = var10000;
            if (~var9 < ~var7) {
               var7 = var9;
            }

            ++var8;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field2958[19] + arg0 + ',' + (arg1 != null ? field2958[11] : field2958[4]) + ',' + arg2 + ',' + (arg3 != null ? field2958[11] : field2958[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(Lgk;IZILgk;)I",
      line = 286
   )
   public static final int method1631(class503 arg0, int arg1, boolean arg2, int arg3, class503 arg4) {
      try {
         ++field2943;
         if (arg3 == 1) {
            int var5 = arg4.field2309;
            int var6 = arg0.field2309;
            if (!arg2) {
               if (~var5 == 0) {
                  var5 = 2001;
               }

               if (~var6 == 0) {
                  var6 = 2001;
               }
            }

            return -var6 + var5;
         } else if (arg3 == 2) {
            return class70.method652(arg4.method3649(108).field6390, class608.field8920, 42, arg0.method3649(119).field6390);
         } else if (~arg3 == -4) {
            if (arg4.field7296.equals("-")) {
               if (arg0.field7296.equals("-")) {
                  return 0;
               } else {
                  return !arg2 ? 1 : -1;
               }
            } else if (arg0.field7296.equals("-")) {
               return arg2 ? 1 : -1;
            } else {
               return class70.method652(arg4.field7296, class608.field8920, 114, arg0.field7296);
            }
         } else if (~arg3 == -5) {
            if (arg4.method1356(116)) {
               return arg0.method1356(55) ? 0 : 1;
            } else {
               return !arg0.method1356(76) ? 0 : -1;
            }
         } else if (arg3 == 5) {
            if (!arg4.method1357(-22203)) {
               return !arg0.method1357(-22203) ? 0 : -1;
            } else {
               return !arg0.method1357(-22203) ? 1 : 0;
            }
         } else {
            int var7 = 47 / ((arg1 - -22) / 38);
            if (~arg3 == -7) {
               if (!arg4.method1360(0)) {
                  return arg0.method1360(0) ? -1 : 0;
               } else {
                  return !arg0.method1360(0) ? 1 : 0;
               }
            } else if (~arg3 == -8) {
               if (arg4.method1358(0)) {
                  return !arg0.method1358(0) ? 1 : 0;
               } else {
                  return arg0.method1358(0) ? -1 : 0;
               }
            } else if (~arg3 != -9) {
               return -arg0.field7304 + arg4.field7304;
            } else {
               int var8 = arg4.field7298;
               int var9 = arg0.field7298;
               if (arg2) {
                  if (~var9 == -1001) {
                     var9 = -1;
                  }

                  if (~var8 != -1001) {
                     return -var9 + var8;
                  }

                  var8 = -1;
                  if (!client.field4360) {
                     return -var9 + var8;
                  }
               }

               if (var9 == -1) {
                  var9 = 1000;
               }

               if (var8 == -1) {
                  var8 = 1000;
               }

               return -var9 + var8;
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field2958[16] + (arg0 != null ? field2958[11] : field2958[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2958[11] : field2958[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(I)V",
      line = 386
   )
   public static void method1632(int arg0) {
      try {
         field2957 = null;
         if (arg0 != 7576) {
            method1631((class503)null, 11, false, -115, (class503)null);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2958[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(BI)I",
      line = 396
   )
   public final int method1633(byte arg0, int arg1) {
      try {
         ++field2955;
         if (arg0 != 49) {
            field2957 = null;
         }

         return this.field2947[arg1] & 255;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2958[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(II[Lbg;Ljava/lang/String;)I",
      line = 409
   )
   public final int method1634(int arg0, int arg1, class492[] arg2, String arg3) {
      try {
         ++field2945;
         if (arg1 != -18886) {
            this.field2944 = -122;
         }

         return this.method1629(false, class635.field9290, arg2, arg3, new int[]{arg0});
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2958[20] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2958[11] : field2958[4]) + ',' + (arg3 != null ? field2958[11] : field2958[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(Ljava/lang/String;B)I",
      line = 422
   )
   public final int method1635(String arg0, byte arg1) {
      try {
         if (arg1 != -81) {
            this.field2956 = 60;
         }

         ++field2946;
         return this.method1639((class492[])null, arg0, 60);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2958[21] + (arg0 != null ? field2958[11] : field2958[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "([Lbg;IILjava/lang/String;)Ljava/lang/String;",
      line = 435
   )
   public final String method1636(class492[] param1, int param2, int param3, String param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(Ljava/lang/String;III[Lbg;)I",
      line = 557
   )
   public final int method1637(String arg0, int arg1, int arg2, int arg3, class492[] arg4) {
      try {
         ++field2948;
         if (~arg2 == -1) {
            arg2 = this.field2950;
         }

         int var6 = this.method1629(false, class635.field9290, arg4, arg0, new int[]{arg3});
         int var7 = (arg1 + var6) * arg2;
         return this.field2944 + var7 + this.field2956;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field2958[17] + (arg0 != null ? field2958[11] : field2958[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2958[11] : field2958[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(BCI)I",
      line = 573
   )
   public final int method1638(byte arg0, char arg1, int arg2) {
      try {
         ++field2951;
         if (arg0 != -121) {
            return -64;
         } else {
            return this.field2949 != null ? this.field2949[arg2][arg1] : 0;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2958[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "([Lbg;Ljava/lang/String;I)I",
      line = 589
   )
   public final int method1639(class492[] param1, String param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ru",
      name = "<init>",
      descriptor = "([B)V",
      line = 702
   )
   public class206(byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1640(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1641(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
