import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class230 {
   @OriginalMember(
      owner = "client!hm",
      name = "d",
      descriptor = "I"
   )
   public int field3381;
   @OriginalMember(
      owner = "client!hm",
      name = "e",
      descriptor = "I"
   )
   public int field3378;
   @OriginalMember(
      owner = "client!hm",
      name = "g",
      descriptor = "I"
   )
   public int field3380;
   @OriginalMember(
      owner = "client!hm",
      name = "b",
      descriptor = "I"
   )
   public int field3379;
   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3382 = new String[]{method1911(method1910("\u0015\"\u000eB=")), method1911(method1910("\u0000yL\u0000")), method1911(method1910("\u0006a\u000e.h")), method1911(method1910("\u0006a\u000eP)\u0000eTRh")), method1911(method1910("\u0006a\u000e\u0018/=xR\u0005.\t$")), method1911(method1910("\u0006a\u000e-h"))};
   @OriginalMember(
      owner = "client!hm",
      name = "f",
      descriptor = "I"
   )
   public static int field3375;
   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "I"
   )
   public static int field3376;
   @OriginalMember(
      owner = "client!hm",
      name = "c",
      descriptor = "I"
   )
   public static int field3377;

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(Lhw;Lhw;BLhw;Lpo;Lwq;)Z",
      line = 3
   )
   public static final boolean method1907(class141 arg0, class141 arg1, byte arg2, class141 arg3, class582 arg4, class176 arg5) {
      boolean var6 = client.field4564;

      try {
         class654.field9505 = arg5;
         class657.field9595 = arg4;
         ++field3376;
         class45.field1000 = arg1;
         client.field4561 = new int[16];
         class110.field1795 = arg3;
         class753.field10848 = arg0;
         if (arg2 != -127) {
            return false;
         } else {
            int var7 = 0;
            if (var6) {
               client.field4561[var7] = 255;
               ++var7;
            }

            while(true) {
               while(var7 < 16) {
                  client.field4561[var7] = 255;
                  ++var7;
               }

               if (!var6) {
                  return true;
               }

               ++var7;
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3382[2] + (arg0 != null ? field3382[0] : field3382[1]) + ',' + (arg1 != null ? field3382[0] : field3382[1]) + ',' + arg2 + ',' + (arg3 != null ? field3382[0] : field3382[1]) + ',' + (arg4 != null ? field3382[0] : field3382[1]) + ',' + (arg5 != null ? field3382[0] : field3382[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(Z)V",
      line = 29
   )
   public static final void method1908(boolean arg0) {
      if (arg0) {
         class90.field1473 = class748.field10792;
         class269.field3810 = class455.field6647;
      } else {
         class90.field1473 = class31.field474;
         class269.field3810 = class530.field7721;
      }

      class323.field4655 = class90.field1473.length;
   }

   @OriginalMember(
      owner = "client!hm",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 48
   )
   public final String toString() {
      try {
         ++field3377;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3382[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(I)V",
      line = 56
   )
   public static final void method1909(int arg0) {
      try {
         ++field3375;
         if (arg0 != 16) {
            method1907((class141)null, (class141)null, (byte)-45, (class141)null, (class582)null, (class176)null);
         }

         class283.field3959.method1589((byte)103);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3382[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "<init>",
      descriptor = "(IIII)V",
      line = 71
   )
   public class230(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field3381 = arg2;
         this.field3378 = arg3;
         this.field3380 = arg1;
         this.field3379 = arg0;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3382[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1910(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1911(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
