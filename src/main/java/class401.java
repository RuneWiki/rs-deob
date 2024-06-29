import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class401 {
   @OriginalMember(
      owner = "client!dda",
      name = "e",
      descriptor = "I"
   )
   public int field6155 = 16777215;
   @OriginalMember(
      owner = "client!dda",
      name = "p",
      descriptor = "I"
   )
   public int field6159 = 8;
   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6169 = new String[]{method3084(method3083("MHa\t")), method3084(method3083("X\u0013#K1")), method3084(method3083("GYlK\b\u000b")), method3084(method3083("GYlK\u000e\u000b")), method3084(method3083("GYlK\r\u000b")), method3084(method3083("GYlK\t\u000b")), method3084(method3083("GYlK\u000f\u000b"))};
   @OriginalMember(
      owner = "client!dda",
      name = "m",
      descriptor = "Lsd;"
   )
   public static class101 field6153 = new class101(5, -2);
   @OriginalMember(
      owner = "client!dda",
      name = "f",
      descriptor = "J"
   )
   public static long field6165 = (long)(9.999999999E9D * Math.random());
   @OriginalMember(
      owner = "client!dda",
      name = "d",
      descriptor = "Liaa;"
   )
   public static class520 field6163 = new class520(15000);
   @OriginalMember(
      owner = "client!dda",
      name = "g",
      descriptor = "I"
   )
   public int field6154;
   @OriginalMember(
      owner = "client!dda",
      name = "h",
      descriptor = "I"
   )
   public static int field6156;
   @OriginalMember(
      owner = "client!dda",
      name = "k",
      descriptor = "I"
   )
   public int field6157;
   @OriginalMember(
      owner = "client!dda",
      name = "b",
      descriptor = "I"
   )
   public static int field6158;
   @OriginalMember(
      owner = "client!dda",
      name = "n",
      descriptor = "I"
   )
   public int field6160;
   @OriginalMember(
      owner = "client!dda",
      name = "c",
      descriptor = "I"
   )
   public static int field6161;
   @OriginalMember(
      owner = "client!dda",
      name = "o",
      descriptor = "I"
   )
   public static int field6162;
   @OriginalMember(
      owner = "client!dda",
      name = "i",
      descriptor = "I"
   )
   public int field6164;
   @OriginalMember(
      owner = "client!dda",
      name = "l",
      descriptor = "I"
   )
   public int field6166;
   @OriginalMember(
      owner = "client!dda",
      name = "j",
      descriptor = "Lea;"
   )
   public static class572 field6167;
   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "Z"
   )
   public boolean field6168;

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   private final void method3078(int arg0, int arg1, class128 arg2) {
      try {
         if (arg0 <= 49) {
            field6153 = null;
         }

         ++field6158;
         if (arg1 != 1) {
            if (~arg1 != -3) {
               if (arg1 != 3) {
                  if (arg1 != 4) {
                     if (arg1 != 5) {
                        if (~arg1 == -7) {
                           this.field6155 = arg2.method1077(-33);
                           return;
                        }
                     } else {
                        this.field6164 = arg2.method1038((byte)-100);
                     }

                  } else {
                     this.field6160 = arg2.method1104(255);
                  }
               } else {
                  this.field6154 = arg2.method1066(32767);
                  this.field6166 = arg2.method1066(32767);
                  this.field6157 = arg2.method1066(32767);
               }
            } else {
               this.field6168 = true;
            }
         } else {
            this.field6159 = arg2.method1038((byte)-125);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6169[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6169[1] : field6169[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "([J[Ljava/lang/Object;B)V"
   )
   public static final void method3079(long[] arg0, Object[] arg1, byte arg2) {
      try {
         ++field6156;
         int var3 = -65 / ((arg2 - -21) / 56);
         class669.method4867(arg1, 0, arg0, 59, arg0.length + -1);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6169[4] + (arg0 != null ? field6169[1] : field6169[0]) + ',' + (arg1 != null ? field6169[1] : field6169[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3080(byte arg0) {
      try {
         field6163 = null;
         field6167 = null;
         field6153 = null;
         int var1 = -101 / ((17 - arg0) / 60);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6169[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method3081(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            method3079((long[])null, (Object[])null, (byte)97);
         }

         ++field6162;
         return (class100.method868(-1, arg1, arg2) | class394.method3020(arg1, arg2, -1) | class207.method1580(arg1, -6421, arg2)) & class573.method4241(arg1, arg2, 2048);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6169[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(ILjj;)V"
   )
   public final void method3082(int arg0, class128 arg1) {
      int var3 = client.field4530;

      try {
         if (arg0 != 0) {
            this.field6157 = 91;
         }

         while(true) {
            int var4 = arg1.method1104(255);
            if (var4 != 0) {
               this.method3078(106, var4, arg1);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            }

            ++field6161;
            break;
         }

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6169[2] + arg0 + ',' + (arg1 != null ? field6169[1] : field6169[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3083(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3084(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
