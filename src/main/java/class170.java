import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class170 {
   @OriginalMember(
      owner = "client!qo",
      name = "f",
      descriptor = "Lqs;"
   )
   private class771 field2557;
   @OriginalMember(
      owner = "client!qo",
      name = "b",
      descriptor = "J"
   )
   public long field2553;
   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2561 = new String[]{method1586(method1585("JU\u0018=y")), method1586(method1585("@\u0014\u0018R,")), method1586(method1585("UOZ\u0010")), method1586(method1585("JU\u0018\u001a8U[Z\u0015+^\u0012")), method1586(method1585("JU\u0018>y")), method1586(method1585("JU\u0018@8USBBy")), method1586(method1585("JU\u00188y")), method1586(method1585("I]W")), method1586(method1585("JU\u0018?y"))};
   @OriginalMember(
      owner = "client!qo",
      name = "g",
      descriptor = "I"
   )
   public static int field2554 = -2;
   @OriginalMember(
      owner = "client!qo",
      name = "i",
      descriptor = "I"
   )
   public static int field2559 = 0;
   @OriginalMember(
      owner = "client!qo",
      name = "c",
      descriptor = "I"
   )
   public static int field2552;
   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "I"
   )
   public static int field2555;
   @OriginalMember(
      owner = "client!qo",
      name = "d",
      descriptor = "I"
   )
   public static int field2556;
   @OriginalMember(
      owner = "client!qo",
      name = "h",
      descriptor = "I"
   )
   public static int field2558;
   @OriginalMember(
      owner = "client!qo",
      name = "e",
      descriptor = "I"
   )
   public static int field2560;

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1581(byte arg0) {
      try {
         class107 var1 = class455.field6619;
         synchronized(class455.field6619) {
            if (arg0 != 35) {
               method1584(108L, -1);
            }

            class455.field6619.method1045(3);
         }

         ++field2552;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2561[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(IZILjga;)V"
   )
   public static final void method1582(int arg0, boolean arg1, int arg2, class91 arg3) {
      try {
         ++field2560;
         if (class696.field10048 == null && !class678.field9669) {
            if (arg3 != null && class775.method5594(18307, arg3) != null) {
               class696.field10048 = arg3;
               class138.field2224 = class775.method5594(18307, arg3);
               if (!arg1) {
                  field2559 = -59;
               }

               class555.field7891 = false;
               class279.field4232 = arg0;
               class732.field10411 = arg2;
               class643.field9046 = 0;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2561[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2561[1] : field2561[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field2557.method5547(this.field2553, -27403);
         ++field2555;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2561[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(I)Lfr;"
   )
   public static final class314 method1583(int arg0) {
      try {
         if (arg0 > -109) {
            field2554 = -30;
         }

         ++field2558;

         try {
            return (class314)Class.forName(field2561[7]).newInstance();
         } catch (Throwable var2) {
            return new class159();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2561[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method1584(long arg0, int arg1) {
      try {
         try {
            if (arg1 <= 75) {
               method1584(109L, 41);
            }

            Thread.sleep(arg0);
         } catch (InterruptedException var4) {
         }

         ++field2556;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2561[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "<init>",
      descriptor = "(Lqs;JI)V"
   )
   public class170(class771 arg0, long arg1, int arg2) {
      try {
         this.field2557 = arg0;
         this.field2553 = arg1;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2561[5] + (arg0 != null ? field2561[1] : field2561[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1585(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1586(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
