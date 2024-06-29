import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class425 {
   @OriginalMember(
      owner = "client!qba",
      name = "k",
      descriptor = "S"
   )
   public short field6454;
   @OriginalMember(
      owner = "client!qba",
      name = "l",
      descriptor = "S"
   )
   public short field6461;
   @OriginalMember(
      owner = "client!qba",
      name = "b",
      descriptor = "S"
   )
   public short field6458;
   @OriginalMember(
      owner = "client!qba",
      name = "n",
      descriptor = "I"
   )
   public int field6452;
   @OriginalMember(
      owner = "client!qba",
      name = "g",
      descriptor = "Z"
   )
   public boolean field6462;
   @OriginalMember(
      owner = "client!qba",
      name = "i",
      descriptor = "B"
   )
   public byte field6450;
   @OriginalMember(
      owner = "client!qba",
      name = "m",
      descriptor = "B"
   )
   public byte field6459;
   @OriginalMember(
      owner = "client!qba",
      name = "j",
      descriptor = "I"
   )
   public int field6456;
   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6464 = new String[]{method3234(method3233("O/\u0016v\u0005\u0016")), method3234(method3233("EcYv<")), method3234(method3233("P8\u001b4")), method3234(method3233("]/")), method3234(method3233("Q\"")), method3234(method3233("O/\u0016v\u0002\u0016")), method3234(method3233("O/\u0016v\u0000\u0016")), method3234(method3233("O/\u0016v}W#\u001e,\u007f\u0016")), method3234(method3233("O/\u0016v\u0003\u0016"))};
   @OriginalMember(
      owner = "client!qba",
      name = "d",
      descriptor = "I"
   )
   public static int field6451;
   @OriginalMember(
      owner = "client!qba",
      name = "f",
      descriptor = "I"
   )
   public static int field6453;
   @OriginalMember(
      owner = "client!qba",
      name = "h",
      descriptor = "I"
   )
   public static int field6455;
   @OriginalMember(
      owner = "client!qba",
      name = "e",
      descriptor = "I"
   )
   public static int field6460;
   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "I"
   )
   public static int field6463;
   @OriginalMember(
      owner = "client!qba",
      name = "c",
      descriptor = "Lma;"
   )
   public static class14 field6457;

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(ILlw;)V"
   )
   public static final void method3229(int arg0, class687 arg1) {
      try {
         if (arg0 == 2) {
            ++field6451;
            class552 var2 = (class552)class450.field6839.method5681((long)arg1.field6027, arg0 + -3);
            if (var2 != null) {
               if (var2.field8176 != null) {
                  class149.field1871.method5585(var2.field8176);
                  var2.field8176 = null;
               }

               var2.method2720(0);
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6464[8] + arg0 + ',' + (arg1 != null ? field6464[1] : field6464[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(Lhg;Ljava/awt/Component;IZI)Lsu;"
   )
   public static final class220 method3230(class719 arg0, Component arg1, int arg2, boolean arg3, int arg4) {
      try {
         ++field6463;
         if (arg3) {
            field6453 = -46;
         }

         if (class335.field4787 == 0) {
            throw new IllegalStateException();
         } else if (arg2 >= 0 && ~arg2 > -3) {
            if (arg4 < 256) {
               arg4 = 256;
            }

            try {
               class220 var5 = (class220)Class.forName(field6464[3]).newInstance();
               var5.field2800 = new int[256 * (class532.field7780 ? 2 : 1)];
               var5.field2821 = arg4;
               var5.method1669(arg1);
               var5.field2819 = (-1024 & arg4) + 1024;
               if (var5.field2819 > 16384) {
                  var5.field2819 = 16384;
               }

               var5.method1668(var5.field2819);
               if (class137.field1780 > 0 && class348.field5283 == null) {
                  class348.field5283 = new class117();
                  class348.field5283.field1425 = arg0;
                  arg0.method5214(class348.field5283, -110, class137.field1780);
               }

               if (class348.field5283 != null) {
                  if (class348.field5283.field1423[arg2] != null) {
                     throw new IllegalArgumentException();
                  }

                  class348.field5283.field1423[arg2] = var5;
               }

               return var5;
            } catch (Throwable var9) {
               try {
                  class602 var6 = new class602(arg0, arg2);
                  var6.field2800 = new int[(class532.field7780 ? 2 : 1) * 256];
                  var6.field2821 = arg4;
                  var6.method1669(arg1);
                  var6.field2819 = 16384;
                  var6.method1668(var6.field2819);
                  if (class137.field1780 > 0 && class348.field5283 == null) {
                     class348.field5283 = new class117();
                     class348.field5283.field1425 = arg0;
                     arg0.method5214(class348.field5283, 116, class137.field1780);
                  }

                  if (class348.field5283 != null) {
                     if (class348.field5283.field1423[arg2] != null) {
                        throw new IllegalArgumentException();
                     }

                     class348.field5283.field1423[arg2] = var6;
                  }

                  return var6;
               } catch (Throwable var8) {
                  return new class220();
               }
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field6464[0] + (arg0 != null ? field6464[1] : field6464[2]) + ',' + (arg1 != null ? field6464[1] : field6464[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3231(int arg0) {
      try {
         if (arg0 < 45) {
            method3232(true, -80, -85, (Canvas)null);
         }

         field6457 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6464[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(ZIILjava/awt/Canvas;)Lqi;"
   )
   public static final class593 method3232(boolean arg0, int arg1, int arg2, Canvas arg3) {
      try {
         ++field6455;
         if (!arg0) {
            field6460 = 123;
         }

         try {
            Class var4 = Class.forName(field6464[4]);
            class593 var5 = (class593)var4.newInstance();
            var5.method986(arg1, arg2, arg3, (byte)126);
            return var5;
         } catch (Throwable var8) {
            class118 var6 = new class118();
            var6.method986(arg1, arg2, arg3, (byte)97);
            return var6;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field6464[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6464[1] : field6464[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "<init>",
      descriptor = "(IIIIIIIIIZI)V"
   )
   public class425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
      try {
         this.field6454 = (short)arg4;
         this.field6461 = (short)arg6;
         this.field6458 = (short)arg5;
         this.field6452 = arg0;
         this.field6462 = arg9;
         this.field6450 = (byte)arg7;
         this.field6459 = (byte)arg8;
         this.field6456 = arg10;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6464[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3233(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3234(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
