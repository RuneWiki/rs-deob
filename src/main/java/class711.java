import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class711 extends class645 {
   @OriginalMember(
      owner = "client!qf",
      name = "G",
      descriptor = "[[B"
   )
   private byte[][] field10365 = new byte[10][];
   @OriginalMember(
      owner = "client!qf",
      name = "H",
      descriptor = "Lwf;"
   )
   private class147 field10369 = new class147((byte[])null);
   @OriginalMember(
      owner = "client!qf",
      name = "Q",
      descriptor = "Lwf;"
   )
   private class147 field10375 = new class147((byte[])null);
   @OriginalMember(
      owner = "client!qf",
      name = "S",
      descriptor = "Lkf;"
   )
   private class266 field10374;
   @OriginalMember(
      owner = "client!qf",
      name = "E",
      descriptor = "I"
   )
   private int field10371;
   @OriginalMember(
      owner = "client!qf",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10379 = new String[]{method5173(method5172("=D\u001b29")), method5173(method5172("=D\u001b79")), method5173(method5172("7\f\u001bXl")), method5173(method5172("=D\u001b49")), method5173(method5172("\"WY\u001a")), method5173(method5172("=D\u001bJx\"KAH9")), method5173(method5172("=D\u001b59")), method5173(method5172("=D\u001b39"))};
   @OriginalMember(
      owner = "client!qf",
      name = "U",
      descriptor = "I"
   )
   public static int field10373 = 0;
   @OriginalMember(
      owner = "client!qf",
      name = "F",
      descriptor = "Leg;"
   )
   public static class118 field10367 = new class118(53, -2);
   @OriginalMember(
      owner = "client!qf",
      name = "M",
      descriptor = "Lgj;"
   )
   public static class663 field10376 = new class663();
   @OriginalMember(
      owner = "client!qf",
      name = "P",
      descriptor = "Leg;"
   )
   public static class118 field10377 = new class118(52, 1);
   @OriginalMember(
      owner = "client!qf",
      name = "R",
      descriptor = "[[I"
   )
   public static int[][] field10378 = new int[128][128];
   @OriginalMember(
      owner = "client!qf",
      name = "T",
      descriptor = "I"
   )
   public static int field10363;
   @OriginalMember(
      owner = "client!qf",
      name = "D",
      descriptor = "I"
   )
   public static int field10364;
   @OriginalMember(
      owner = "client!qf",
      name = "O",
      descriptor = "I"
   )
   public static int field10366;
   @OriginalMember(
      owner = "client!qf",
      name = "J",
      descriptor = "I"
   )
   public static int field10368;
   @OriginalMember(
      owner = "client!qf",
      name = "N",
      descriptor = "I"
   )
   private int field10372;
   @OriginalMember(
      owner = "client!qf",
      name = "L",
      descriptor = "[I"
   )
   private int[] field10370;

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "([BI)I"
   )
   public final int method4670(byte[] arg0, int arg1) throws IOException {
      boolean var3 = client.field4360;

      try {
         ++field10368;
         if (this.field10370 == null) {
            if (!this.field10374.method2036(0, this.field10371, 0)) {
               return 0;
            }

            byte[] var4 = this.field10374.method2037(false, 0, this.field10371);
            if (var4 == null) {
               throw new IllegalStateException("");
            }

            this.field10375.field1856 = 0;
            this.field10375.field1889 = var4;
            int var5 = var4.length >> 1;
            this.field10370 = new int[var5];
            int var6 = 0;
            if (var3 || var6 < var5) {
               do {
                  this.field10370[var6] = this.field10375.method1211(-26166);
                  ++var6;
               } while(var6 < var5);
            }
         }

         if (~this.field10370.length >= ~this.field10372) {
            return -1;
         } else {
            this.method5170(0);
            this.field10375.field1889 = arg0;
            if (arg1 != -9) {
               this.field10374 = null;
            }

            this.field10375.field1856 = 0;
            if (!var3 && ~this.field10375.field1856 <= ~this.field10375.field1889.length) {
               this.field10375.field1889 = null;
               return arg0.length;
            } else {
               label88:
               do {
                  if (this.field10369.field1889 == null) {
                     if (this.field10365[0] == null) {
                        this.field10375.field1889 = null;
                        return this.field10375.field1856;
                     }

                     this.field10369.field1889 = this.field10365[0];
                  }

                  int var7 = this.field10375.field1889.length + -this.field10375.field1856;
                  int var8 = this.field10369.field1889.length + -this.field10369.field1856;
                  int var10000 = ~var7;

                  do {
                     if (var10000 > ~var8) {
                        this.field10369.method1191(-5766, var7, this.field10375.field1889, this.field10375.field1856);
                        this.field10375.field1889 = null;
                        return arg0.length;
                     }

                     this.field10375.method1193((byte)-99, this.field10369.field1889, this.field10369.field1856, var8);
                     this.field10369.field1856 = 0;
                     this.field10369.field1889 = null;
                     ++this.field10372;
                     int var9 = 0;
                     if (var3) {
                        this.field10365[var9] = this.field10365[var9 + 1];
                        ++var9;
                     }

                     while(true) {
                        class711 var12;
                        if (var9 >= 9) {
                           this.field10365[9] = null;
                           var12 = this;
                           if (!var3) {
                              if (this.field10370.length > this.field10372) {
                                 continue label88;
                              }

                              this.field10375.field1889 = null;
                              var10000 = this.field10375.field1856;
                              break;
                           }
                        } else {
                           var12 = this;
                        }

                        var12.field10365[var9] = this.field10365[var9 + 1];
                        ++var9;
                     }
                  } while(var3);

                  return var10000;
               } while(~this.field10375.field1856 > ~this.field10375.field1889.length);

               this.field10375.field1889 = null;
               return arg0.length;
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field10379[7] + (arg0 != null ? field10379[2] : field10379[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method5168(class66 arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field10364;
         class577 var3 = (class577)class663.field9658.method5529((byte)-42);
         if (var2) {
            if (var3.field8525) {
               var3.method4200(arg0);
            }

            var3 = (class577)class663.field9658.method5527((byte)45);
         }

         while(true) {
            int var10000;
            if (var3 == null) {
               var10000 = arg1;
               if (!var2) {
                  if (arg1 != -128) {
                     field10377 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var3.field8525;
            }

            if (var10000 != 0) {
               var3.method4200(arg0);
            }

            var3 = (class577)class663.field9658.method5527((byte)45);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10379[3] + (arg0 != null ? field10379[2] : field10379[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method5169(int arg0) {
      try {
         if (arg0 != 5643) {
            method5168((class66)null, 62);
         }

         field10367 = null;
         field10378 = null;
         field10376 = null;
         field10377 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10379[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "<init>",
      descriptor = "(ILkf;I)V"
   )
   public class711(int arg0, class266 arg1, int arg2) {
      super(arg0);

      try {
         this.field10374 = arg1;
         this.field10371 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10379[5] + arg0 + ',' + (arg1 != null ? field10379[2] : field10379[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method5170(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field10366;
         if (this.field10370 != null) {
            int var3 = arg0;
            if (!var2) {
               if (~arg0 <= -11) {
                  return;
               }

               if (arg0 - -this.field10372 >= this.field10370.length) {
                  return;
               }
            }

            do {
               if (this.field10365[var3] == null && this.field10374.method2036(0, this.field10370[this.field10372 + var3], 0)) {
                  this.field10365[var3] = this.field10374.method2037(false, 0, this.field10370[this.field10372 + var3]);
               }

               ++var3;
               if (~var3 <= -11) {
                  return;
               }
            } while(var3 - -this.field10372 < this.field10370.length);

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10379[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(BII)I"
   )
   public static final int method5171(byte arg0, int arg1, int arg2) {
      try {
         ++field10363;
         if (arg0 > -108) {
            return 42;
         } else {
            int var3 = -128 + class598.method4346(arg1 - -91923, arg2 + 45365, 4, 11530) - (-(class598.method4346(arg1 + 37821, arg2 - -10294, 2, 11530) + -128 >> 1) - (class598.method4346(arg1, arg2, 1, 11530) + -128 >> 2));
            int var4 = (int)((double)var3 * 0.3D) + 35;
            if (~var4 <= -11) {
               if (var4 <= 60) {
                  return var4;
               }

               var4 = 60;
               if (!client.field4360) {
                  return var4;
               }
            }

            var4 = 10;
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10379[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5172(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5173(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
