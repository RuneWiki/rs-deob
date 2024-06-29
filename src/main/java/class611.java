import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class611 implements class518 {
   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "I"
   )
   public int field8970;
   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8974 = new String[]{method4446(method4445("1+\u0010|h")), method4446(method4445("1+\u0010}h")), method4446(method4445("1+\u0010{h")), method4446(method4445("1+\u0010xh")), method4446(method4445("/3RU")), method4446(method4445(":h\u0010\u0017=")), method4446(method4445("1+\u0010\u0005)//J\u0007h")), method4446(method4445("1+\u0010zh"))};
   @OriginalMember(
      owner = "client!pm",
      name = "c",
      descriptor = "[F"
   )
   public static float[] field8971 = new float[4];
   @OriginalMember(
      owner = "client!pm",
      name = "f",
      descriptor = "I"
   )
   public static int field8966;
   @OriginalMember(
      owner = "client!pm",
      name = "d",
      descriptor = "I"
   )
   public static int field8967;
   @OriginalMember(
      owner = "client!pm",
      name = "b",
      descriptor = "I"
   )
   public static int field8969;
   @OriginalMember(
      owner = "client!pm",
      name = "h",
      descriptor = "I"
   )
   public static int field8972;
   @OriginalMember(
      owner = "client!pm",
      name = "i",
      descriptor = "I"
   )
   public static int field8973;
   @OriginalMember(
      owner = "client!pm",
      name = "e",
      descriptor = "Lwb;"
   )
   public static class350 field8968;
   @OriginalMember(
      owner = "client!pm",
      name = "g",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field8965;

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4441(int arg0) {
      try {
         if (arg0 == -1) {
            field8971 = null;
            field8965 = null;
            field8968 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8974[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(IILum;II)V"
   )
   public static final void method4442(int param0, int param1, class553 param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(ZLbl;IZI)V"
   )
   public static final void method4443(boolean arg0, class678 arg1, int arg2, boolean arg3, int arg4) {
      boolean var5 = client.field4360;

      try {
         int var6;
         int var7;
         label125: {
            ++field8972;
            var6 = arg1.field9904;
            var7 = arg1.field9980;
            if (~arg1.field9923 == -1) {
               arg1.field9904 = arg1.field9954;
               if (!var5) {
                  break label125;
               }
            }

            if (arg1.field9923 == 1) {
               arg1.field9904 = -arg1.field9954 + arg2;
               if (!var5) {
                  break label125;
               }
            }

            if (~arg1.field9923 == -3) {
               arg1.field9904 = arg1.field9954 * arg2 >> 14;
            }
         }

         label126: {
            if (arg1.field9948 == 0) {
               arg1.field9980 = arg1.field9981;
               if (!var5) {
                  break label126;
               }
            }

            if (arg1.field9948 == 1) {
               arg1.field9980 = -arg1.field9981 + arg4;
               if (!var5) {
                  break label126;
               }
            }

            if (~arg1.field9948 == -3) {
               arg1.field9980 = arg1.field9981 * arg4 >> 14;
            }
         }

         if (~arg1.field9923 == -5) {
            arg1.field9904 = arg1.field9980 * arg1.field9955 / arg1.field9951;
         }

         if (arg3) {
            if (arg1.field9948 == 4) {
               arg1.field9980 = arg1.field9951 * arg1.field9904 / arg1.field9955;
            }

            if (class661.field9629 && (client.method2351(arg1).field3965 != 0 || ~arg1.field9992 == -1)) {
               label136: {
                  if (~arg1.field9980 <= -6 || ~arg1.field9904 <= -6) {
                     if (arg1.field9980 <= 0) {
                        arg1.field9980 = 5;
                     }

                     if (~arg1.field9904 < -1) {
                        break label136;
                     }

                     arg1.field9904 = 5;
                     if (!var5) {
                        break label136;
                     }
                  }

                  arg1.field9980 = 5;
                  arg1.field9904 = 5;
               }
            }

            if (class340.field4621 == arg1.field9865) {
               class31.field445 = arg1;
            }

            if (arg0 && arg1.field9850 != null) {
               if (arg1.field9904 != var6 || arg1.field9980 != var7) {
                  class421 var8 = new class421();
                  var8.field6014 = arg1;
                  var8.field6010 = arg1.field9850;
                  class460.field6601.method2930((byte)-66, var8);
               }

            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8974[3] + arg0 + ',' + (arg1 != null ? field8974[5] : field8974[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method4444(int arg0, byte arg1) {
      try {
         class559.field8010 = arg0;
         ++field8969;
         class80 var2 = class220.field3139;
         synchronized(class220.field3139) {
            class220.field3139.method731(arg1 ^ 122);
            if (arg1 != 122) {
               field8971 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8974[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(B)Lqca;"
   )
   public final class127 method993(byte arg0) {
      try {
         ++field8966;
         if (arg0 != -48) {
            method4443(true, (class678)null, -14, true, -65);
         }

         return class9.field85;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8974[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class611(int arg0) {
      try {
         this.field8970 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8974[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4445(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4446(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
