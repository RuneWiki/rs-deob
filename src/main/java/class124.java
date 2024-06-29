import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class124 extends class408 {
   @OriginalMember(
      owner = "client!lfa",
      name = "x",
      descriptor = "I"
   )
   private int field1504;
   @OriginalMember(
      owner = "client!lfa",
      name = "o",
      descriptor = "I"
   )
   private int field1505;
   @OriginalMember(
      owner = "client!lfa",
      name = "t",
      descriptor = "I"
   )
   private int field1511;
   @OriginalMember(
      owner = "client!lfa",
      name = "q",
      descriptor = "I"
   )
   private int field1510;
   @OriginalMember(
      owner = "client!lfa",
      name = "n",
      descriptor = "I"
   )
   private int field1506;
   @OriginalMember(
      owner = "client!lfa",
      name = "u",
      descriptor = "I"
   )
   private int field1507;
   @OriginalMember(
      owner = "client!lfa",
      name = "s",
      descriptor = "Ldh;"
   )
   private class338 field1503;
   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1516 = new String[]{method1025(method1024("3\u001dt%4w")), method1025(method1024("$U;%\r")), method1025(method1024("1\u000eyg")), method1025(method1024("3\u001dt%5w")), method1025(method1024("3\u001dt%L6\u0015|\u007fNw")), method1025(method1024("3\u001dt%7w")), method1025(method1024("3\u001dt%6w"))};
   @OriginalMember(
      owner = "client!lfa",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field1513 = new int[]{3, 7, 15};
   @OriginalMember(
      owner = "client!lfa",
      name = "p",
      descriptor = "I"
   )
   public static int field1509;
   @OriginalMember(
      owner = "client!lfa",
      name = "r",
      descriptor = "I"
   )
   public static int field1512;
   @OriginalMember(
      owner = "client!lfa",
      name = "v",
      descriptor = "I"
   )
   public static int field1514;
   @OriginalMember(
      owner = "client!lfa",
      name = "w",
      descriptor = "I"
   )
   public static int field1515;
   @OriginalMember(
      owner = "client!lfa",
      name = "m",
      descriptor = "Lcea;"
   )
   private class223 field1508;

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(Lkg;III)V",
      line = 9
   )
   public static final void method1019(class284 arg0, int arg1, int arg2, int arg3) {
      try {
         class208.field2653[arg1][arg2] = arg0;
         ++field1514;
         if (arg3 != 4220) {
            field1515 = 86;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1516[3] + (arg0 != null ? field1516[1] : field1516[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(B)V",
      line = 20
   )
   public static final void method1020(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "<init>",
      descriptor = "(Ldh;IIIIII)V",
      line = 66
   )
   public class124(class338 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field1504 = arg1;
         this.field1505 = arg6;
         this.field1511 = arg5;
         this.field1510 = arg3;
         this.field1506 = arg4;
         this.field1507 = arg2;
         this.field1503 = arg0;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field1516[4] + (arg0 != null ? field1516[1] : field1516[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "c",
      descriptor = "(I)V",
      line = 81
   )
   public static void method1021(int arg0) {
      try {
         field1513 = null;
         if (arg0 > -55) {
            method1020((byte)124);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1516[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "()V",
      line = 91
   )
   public static final void method1022() {
      if (class293.field4084 != null) {
         for(int var0 = 0; var0 < class293.field4084.length; ++var0) {
            for(int var1 = 0; var1 < class239.field3036; ++var1) {
               for(int var2 = 0; var2 < class220.field2796; ++var2) {
                  if (class293.field4084[var0][var1][var2] != null) {
                     class293.field4084[var0][var1][var2].method716(false);
                  }

                  class293.field4084[var0][var1][var2] = null;
               }
            }
         }
      }

      class293.field4084 = null;
      class147.field1843 = null;
      if (class91.field1171 != null) {
         for(int var3 = 0; var3 < class91.field1171.length; ++var3) {
            for(int var4 = 0; var4 < class239.field3036; ++var4) {
               for(int var5 = 0; var5 < class220.field2796; ++var5) {
                  if (class91.field1171[var3][var4][var5] != null) {
                     class91.field1171[var3][var4][var5].method716(false);
                  }

                  class91.field1171[var3][var4][var5] = null;
               }
            }
         }
      }

      class91.field1171 = null;
      class650.field9484 = null;
      class353.field5360 = null;
      class377.field5711 = null;
      class569.field8487 = null;
      class374.field5674 = null;
      class190.field2372 = null;
      class243.field3107 = null;
      class18.field207 = null;
      class5.method42(26648);
      if (class64.field789 != null) {
         for(int var6 = 0; var6 < class87.field1060; ++var6) {
            class64.field789[var6] = null;
         }

         class87.field1060 = 0;
      }

      class764.field11222 = null;
      class197.field2449 = null;
      class535.field7803 = null;
      if (class490.field7245 != null) {
         for(int var7 = 0; var7 < class490.field7245.length; ++var7) {
            class490.field7245[var7] = null;
         }

         class301.field4290 = 0;
      }

      if (class532.field7777 != null) {
         for(int var8 = 0; var8 < class532.field7777.length; ++var8) {
            class532.field7777[var8] = null;
         }

         class425.field6460 = 0;
      }

      if (class535.field7812 != null) {
         for(int var9 = 0; var9 < class48.field579; ++var9) {
            class535.field7812[var9] = null;
         }

         for(int var10 = 0; var10 < class424.field6437; ++var10) {
            for(int var11 = 0; var11 < class239.field3036; ++var11) {
               for(int var12 = 0; var12 < class220.field2796; ++var12) {
                  class544.field8093[var10][var11][var12] = 0L;
               }
            }
         }

         class48.field579 = 0;
      }

      class277.method2134(false);
      class499.field7394 = class499.field7386;
      class499.field7394.method5144(true);
      class583.field8642 = null;
      class173.field2163 = null;
      class661.field9571 = null;
      if (class102.field1244 != null) {
         class413.method3155();
         class261.field3550.method628(1);
         class261.field3550.method563(0);
      }

      if (class688.field10367 != null) {
         class688.field10367 = null;
      }

      class261.field3550 = null;
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(I)Lcea;",
      line = 266
   )
   public final class223 method1023(int arg0) {
      int var2 = client.field4530;

      try {
         if (arg0 != 1) {
            return null;
         } else {
            ++field1512;
            if (this.field1508 == null) {
               class160 var3;
               boolean var4;
               int var5;
               int var9;
               label88: {
                  class360.field5433[2] = this.field1510;
                  class360.field5433[4] = this.field1511;
                  class360.field5433[3] = this.field1506;
                  class360.field5433[0] = this.field1504;
                  class360.field5433[1] = this.field1507;
                  class360.field5433[5] = this.field1505;
                  var3 = this.field1503.field813;
                  var4 = false;
                  var5 = 0;
                  int var6 = 0;
                  if (var2 != 0) {
                     if (!var3.method1165(class360.field5433[var6], -23239)) {
                        return null;
                     }
                  } else if (~var6 <= -7) {
                     var9 = 0;
                     if (var2 == 0) {
                        break label88;
                     }
                  } else if (!var3.method1165(class360.field5433[var6], -23239)) {
                     return null;
                  }

                  while(true) {
                     class327 var7 = var3.method1159(class360.field5433[var6], arg0 ^ 125);
                     int var8 = !var7.field4646 ? 128 : 64;
                     if (~var8 < ~var5) {
                        var5 = var8;
                     }

                     if (~var7.field4634 < -1) {
                        var4 = true;
                     }

                     ++var6;
                     if (~var6 <= -7) {
                        var9 = 0;
                        if (var2 == 0) {
                           break;
                        }
                     } else if (!var3.method1165(class360.field5433[var6], -23239)) {
                        return null;
                     }
                  }
               }

               if (var2 != 0) {
                  class135.field1725[var9] = var3.method1166((byte)89, 1.0F, var5, var5, false, class360.field5433[var9]);
                  ++var9;
               }

               while(true) {
                  while(var9 < 6) {
                     class135.field1725[var9] = var3.method1166((byte)89, 1.0F, var5, var5, false, class360.field5433[var9]);
                     ++var9;
                  }

                  if (var2 == 0) {
                     this.field1508 = this.field1503.method2580(var5, var4, class135.field1725, -4944);
                     break;
                  }

                  ++var9;
               }
            }

            return this.field1508;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field1516[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1024(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1025(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
