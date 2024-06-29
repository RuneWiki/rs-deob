import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class243 extends class673 {
   @OriginalMember(
      owner = "client!ue",
      name = "r",
      descriptor = "F"
   )
   public float field3067;
   @OriginalMember(
      owner = "client!ue",
      name = "p",
      descriptor = "I"
   )
   public int field3062;
   @OriginalMember(
      owner = "client!ue",
      name = "l",
      descriptor = "I"
   )
   public int field3065;
   @OriginalMember(
      owner = "client!ue",
      name = "x",
      descriptor = "I"
   )
   private int field3066;
   @OriginalMember(
      owner = "client!ue",
      name = "t",
      descriptor = "I"
   )
   public int field3070;
   @OriginalMember(
      owner = "client!ue",
      name = "A",
      descriptor = "I"
   )
   private int field3068;
   @OriginalMember(
      owner = "client!ue",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3072 = new String[]{method1935(method1934("\u0007=g32")), method1935(method1934("\u0007=g82")), method1935(method1934("\u0007=gGs\u001c1=E2")), method1935(method1934("\u0007=g12")), method1935(method1934("\u0007=g92")), method1935(method1934("\u0007=g22")), method1935(method1934("\u0007=g>2")), method1935(method1934("\u0007=g<2")), method1935(method1934("\u0007=g=2")), method1935(method1934("7\u0017\u000f"))};
   @OriginalMember(
      owner = "client!ue",
      name = "w",
      descriptor = "Laka;"
   )
   public static class418 field3056 = new class418(58, 2);
   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "I"
   )
   public static int field3057;
   @OriginalMember(
      owner = "client!ue",
      name = "n",
      descriptor = "I"
   )
   public static int field3058;
   @OriginalMember(
      owner = "client!ue",
      name = "q",
      descriptor = "I"
   )
   public static int field3059;
   @OriginalMember(
      owner = "client!ue",
      name = "o",
      descriptor = "I"
   )
   public static int field3060;
   @OriginalMember(
      owner = "client!ue",
      name = "v",
      descriptor = "I"
   )
   public static int field3063;
   @OriginalMember(
      owner = "client!ue",
      name = "u",
      descriptor = "I"
   )
   public static int field3064;
   @OriginalMember(
      owner = "client!ue",
      name = "y",
      descriptor = "I"
   )
   public static int field3069;
   @OriginalMember(
      owner = "client!ue",
      name = "m",
      descriptor = "I"
   )
   public static int field3071;
   @OriginalMember(
      owner = "client!ue",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field3061;

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(ZIII)V"
   )
   public abstract void method1537(boolean arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1926(int arg0) {
      try {
         int var2 = -84 / ((-20 - arg0) / 36);
         ++field3060;
         return this.field3070;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3072[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1927(byte arg0) {
      try {
         if (arg0 != -8) {
            this.field3067 = -1.1171005F;
         }

         ++field3064;
         return this.field3065;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3072[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1928(int arg0) {
      try {
         ++field3058;
         int var2 = -123 / ((arg0 - 9) / 32);
         return this.field3062;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3072[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1929(int arg0) {
      try {
         if (arg0 != -1) {
            field3056 = null;
         }

         ++field3063;
         return this.field3066;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3072[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1930(int arg0) {
      try {
         if (arg0 < 90) {
            field3056 = null;
         }

         field3056 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3072[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "(Z)F"
   )
   public final float method1931(boolean arg0) {
      try {
         ++field3059;
         if (arg0) {
            this.field3068 = -76;
         }

         return this.field3067;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3072[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(IF)V"
   )
   public abstract void method1536(int arg0, float arg1);

   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "(B)Lme;"
   )
   public static final class752 method1932(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field3057;
         class492 var2 = null;
         class752 var3 = new class752(class688.field10127, 0);

         try {
            int var4 = 81 / ((arg0 - 57) / 41);
            class769 var5 = class366.field5092.method5332("", (byte)-14, true);
            if (var1) {
               class340.method2717(1L, (byte)-119);
            }

            while(~var5.field11210 == -1) {
               class340.method2717(1L, (byte)-119);
            }

            if (var5.field11210 == 1) {
               var2 = (class492)var5.field11212;
               byte[] var6 = new byte[(int)var2.method3743(3)];
               int var7 = 0;
               if (var1 || var6.length > var7) {
                  do {
                     int var8 = var2.method3739(var6, var6.length - var7, (byte)-118, var7);
                     if (var8 == -1) {
                        throw new IOException(field3072[9]);
                     }

                     var7 += var8;
                  } while(var6.length > var7);
               }

               var3 = new class752(new class66(var6), class688.field10127, 0);
            }
         } catch (Exception var11) {
         }

         try {
            if (var2 != null) {
               var2.method3744(1571);
            }
         } catch (Exception var10) {
         }

         return var3;
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field3072[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1933(boolean arg0) {
      try {
         ++field3069;
         return arg0 ? 63 : this.field3068;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3072[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class243(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         this.field3067 = arg5;
         this.field3062 = arg2;
         this.field3065 = arg0;
         this.field3066 = arg4;
         this.field3070 = arg1;
         this.field3068 = arg3;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3072[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1934(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1935(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
