import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class700 extends class141 {
   @OriginalMember(
      owner = "client!pc",
      name = "t",
      descriptor = "Z"
   )
   private boolean field10249 = false;
   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10253 = new String[]{method5089(method5088("\u001f!4\u0010R")), method5089(method5088("\u001f!4\u0012R")), method5089(method5088("\u001f!4\u0014R")), method5089(method5088("\u001f!4\u0011R")), method5089(method5088("\u00017v;")), method5089(method5088("\u0014l4y\u0007")), method5089(method5088("\u001f!4\u0013R")), method5089(method5088("\u001f!4\u001eR")), method5089(method5088("\u001f!4\u001fR")), method5089(method5088("\u001f!4\u001dR")), method5089(method5088("\u001f!4\u0016R")), method5089(method5088("\u001f!4\u0015R"))};
   @OriginalMember(
      owner = "client!pc",
      name = "r",
      descriptor = "Llea;"
   )
   public static class639 field10243 = new class639(2, 7);
   @OriginalMember(
      owner = "client!pc",
      name = "m",
      descriptor = "I"
   )
   public static int field10241;
   @OriginalMember(
      owner = "client!pc",
      name = "w",
      descriptor = "I"
   )
   public static int field10242;
   @OriginalMember(
      owner = "client!pc",
      name = "v",
      descriptor = "I"
   )
   public static int field10244;
   @OriginalMember(
      owner = "client!pc",
      name = "n",
      descriptor = "I"
   )
   public static int field10245;
   @OriginalMember(
      owner = "client!pc",
      name = "x",
      descriptor = "I"
   )
   public static int field10246;
   @OriginalMember(
      owner = "client!pc",
      name = "p",
      descriptor = "I"
   )
   public static int field10247;
   @OriginalMember(
      owner = "client!pc",
      name = "s",
      descriptor = "I"
   )
   public static int field10250;
   @OriginalMember(
      owner = "client!pc",
      name = "q",
      descriptor = "I"
   )
   public static int field10251;
   @OriginalMember(
      owner = "client!pc",
      name = "u",
      descriptor = "I"
   )
   public static int field10252;
   @OriginalMember(
      owner = "client!pc",
      name = "o",
      descriptor = "J"
   )
   public static long field10248;

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method313(boolean arg0) {
      try {
         if (!arg0) {
            return true;
         } else {
            ++field10244;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10253[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "(ZZ)V"
   )
   public final void method309(boolean arg0, boolean arg1) {
      try {
         ++field10242;
         if (arg0) {
            this.field10249 = false;
         }

         class349 var3 = super.field1801.method2779(72);
         if (var3 != null && arg1) {
            super.field1801.method2763(1, -51);
            super.field1801.method2804(var3, -2);
            super.field1801.method2607((byte)-78, class679.field10013);
            super.field1801.method2763(1, -76);
            super.field1801.method2745(-30, class144.field1826, class603.field8872);
            super.field1801.method2635(class706.field10312, 2, -128, true, false);
            super.field1801.method2787(class691.field10171, (byte)-51, 0);
            class716 var4 = super.field1801.method2821((byte)76);
            var4.method5207(true, super.field1801.method2774(!arg0));
            super.field1801.method2778((byte)-127, class505.field7325);
            super.field1801.method2763(0, -63);
            this.field10249 = true;
         } else {
            super.field1801.method2787(class691.field10171, (byte)-51, 0);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10253[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "<init>",
      descriptor = "(Lsc;)V"
   )
   public class700(class369 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5084(int arg0) {
      try {
         if (arg0 < 9) {
            field10248 = -125L;
         }

         field10243 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10253[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method311(boolean arg0, boolean arg1) {
      try {
         super.field1801.method2745(-30, class458.field6587, class603.field8872);
         ++field10251;
         if (arg0) {
            this.method317(-35, 77, 76);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10253[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(IZLim;I)V"
   )
   public static final void method5085(int arg0, boolean arg1, class598 arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         if (!arg1) {
            ++field10250;
            if (class131.field1677) {
               int var5 = 0;
               class32 var6 = (class32)arg2.field8795.method3488((byte)-120);
               int var7;
               if (var4) {
                  var7 = class455.method3319((byte)115, var6);
                  if (var7 > var5) {
                     var5 = var7;
                  }

                  var6 = (class32)arg2.field8795.method3484(0);
               }

               while(true) {
                  int var10000;
                  int var10001;
                  if (var6 == null) {
                     var5 += 8;
                     var7 = arg2.field8785 * 16 + 21;
                     var10000 = arg2.field8785 * 16;
                     var10001 = class743.field10822;
                     if (!var4) {
                        class535.field7631 = var10000 - -(var10001 == 0 ? 22 : 26);
                        int var8 = class285.field3949 + class185.field2624;
                        if (~(var5 + var8) < ~class237.field3310) {
                           var8 = -var5 + class185.field2624;
                        }

                        if (~var8 > -1) {
                           var8 = 0;
                        }

                        int var9 = !class743.field10822 ? 31 : 33;
                        int var10 = -var9 + arg0 + 13;
                        if (class692.field10185 < var10 - -var7) {
                           var10 = -var7 + class692.field10185;
                        }

                        if (var10 < 0) {
                           var10 = 0;
                        }

                        class100.field1286 = var8;
                        class491.field7031 = arg2;
                        class25.field405 = var5;
                        class380.field5479 = var10;
                        return;
                     }
                  } else {
                     var7 = class455.method3319((byte)115, var6);
                     var10000 = var7;
                     var10001 = var5;
                  }

                  if (var10000 > var10001) {
                     var5 = var7;
                  }

                  var6 = (class32)arg2.field8795.method3484(0);
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field10253[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10253[5] : field10253[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(Lm;II)V"
   )
   public final void method310(class205 arg0, int arg1, int arg2) {
      try {
         ++field10246;
         super.field1801.method2804(arg0, -2);
         super.field1801.method2747((byte)-77, arg1);
         if (arg2 != 0) {
            this.method317(-30, -128, -127);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10253[11] + (arg0 != null ? field10253[5] : field10253[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(IBI)I"
   )
   public static final int method5086(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 >= -31) {
            field10248 = 35L;
         }

         ++field10252;
         int var3 = arg0 >> 31 & arg2 + -1;
         return (arg0 - -(arg0 >>> 31)) % arg2 + var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10253[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "([BLjava/io/File;BI)V"
   )
   public static final void method5087(byte[] arg0, File arg1, byte arg2, int arg3) throws IOException {
      try {
         ++field10241;
         int var4 = 32 % ((-90 - arg2) / 33);
         DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));

         try {
            var5.readFully(arg0, 0, arg3);
         } catch (EOFException var7) {
         }

         var5.close();
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10253[3] + (arg0 != null ? field10253[5] : field10253[4]) + ',' + (arg1 != null ? field10253[5] : field10253[4]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method317(int arg0, int arg1, int arg2) {
      try {
         ++field10245;
         if (arg0 != 0) {
            field10243 = null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10253[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method307(byte arg0) {
      try {
         label20: {
            if (!this.field10249) {
               super.field1801.method2787(class10.field93, (byte)-51, 0);
               if (!client.field4360) {
                  break label20;
               }
            }

            super.field1801.method2763(1, -60);
            super.field1801.method2607((byte)-123, class435.field6233);
            super.field1801.method2745(-30, class458.field6587, class458.field6587);
            super.field1801.method2814(2, class304.field4150, true);
            super.field1801.method2787(class10.field93, (byte)-51, 0);
            super.field1801.method2794((byte)-122);
            super.field1801.method2804((class205)null, -2);
            super.field1801.method2763(0, -77);
            this.field10249 = false;
         }

         ++field10247;
         super.field1801.method2745(-30, class458.field6587, class458.field6587);
         if (arg0 < 102) {
            this.method309(false, false);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10253[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5088(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5089(char[] arg0) {
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
            var10005 = 66;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
