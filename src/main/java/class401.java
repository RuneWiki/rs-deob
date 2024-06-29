import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class401 {
   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5513 = new String[]{method3151(method3150("!gHC\u001f")), method3151(method3150(".8H)J")), method3151(method3150(";c\nk")), method3151(method3150("!gHF\u001f")), method3151(method3150("!gHD\u001f")), method3151(method3150("!gHB\u001f")), method3151(method3150("!gHA\u001f")), method3151(method3150("!gHE\u001f"))};
   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "Lml;"
   )
   public static class35 field5505 = new class35();
   @OriginalMember(
      owner = "client!tq",
      name = "g",
      descriptor = "Lhv;"
   )
   public static class227 field5510 = new class227(32);
   @OriginalMember(
      owner = "client!tq",
      name = "b",
      descriptor = "I"
   )
   public static int field5506;
   @OriginalMember(
      owner = "client!tq",
      name = "d",
      descriptor = "I"
   )
   public static int field5507;
   @OriginalMember(
      owner = "client!tq",
      name = "e",
      descriptor = "I"
   )
   public static int field5508;
   @OriginalMember(
      owner = "client!tq",
      name = "c",
      descriptor = "I"
   )
   public static int field5509;
   @OriginalMember(
      owner = "client!tq",
      name = "h",
      descriptor = "I"
   )
   public static int field5511;
   @OriginalMember(
      owner = "client!tq",
      name = "f",
      descriptor = "I"
   )
   public static int field5512;

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method3144(int arg0, byte arg1, int arg2) {
      try {
         int var3 = -109 % ((88 - arg1) / 37);
         ++field5507;
         if (!class409.method3214(arg0, arg2, -10879)) {
            return false;
         } else {
            return ~(36864 & arg0) != -1 | class201.method1666(false, arg2, arg0) | class571.method4292(256, arg0, arg2) ? true : (~(arg0 & 8192) != -1 | class615.method4536(arg0, arg2, (byte)117) | class669.method4882(-116, arg2, arg0)) & (55 & arg2) == 0;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5513[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method3145(byte arg0) {
      try {
         if (arg0 <= 4) {
            method3144(-109, (byte)-32, 10);
         }

         ++field5511;
         return class545.field7968;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5513[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(FLeo;IIFIFIFIIF[B)V"
   )
   public static final void method3146(float param0, class726 param1, int param2, int param3, float param4, int param5, float param6, int param7, float param8, int param9, int param10, float param11, byte[] param12) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(Lst;Lww;Lce;Lww;ILww;)Z"
   )
   public static final boolean method3147(class706 arg0, class339 arg1, class591 arg2, class339 arg3, int arg4, class339 arg5) {
      boolean var6 = client.field1481;

      try {
         class448.field6070 = arg2;
         ++field5512;
         class562.field8267 = arg3;
         class668.field9907 = arg1;
         class98.field1305 = arg0;
         class227.field2844 = arg5;
         if (arg4 != 16) {
            method3146(-1.5683242F, (class726)null, -1, 6, 2.6716588F, -108, 0.6445531F, 101, 0.6139826F, -102, -115, -1.9965671F, (byte[])null);
         }

         class259.field3298 = new int[16];
         int var7 = 0;
         if (var6) {
            class259.field3298[var7] = 255;
            ++var7;
         }

         while(true) {
            while(var7 < 16) {
               class259.field3298[var7] = 255;
               ++var7;
            }

            if (!var6) {
               return true;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field5513[5] + (arg0 != null ? field5513[1] : field5513[2]) + ',' + (arg1 != null ? field5513[1] : field5513[2]) + ',' + (arg2 != null ? field5513[1] : field5513[2]) + ',' + (arg3 != null ? field5513[1] : field5513[2]) + ',' + arg4 + ',' + (arg5 != null ? field5513[1] : field5513[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3148(int arg0, int arg1, int arg2) {
      try {
         if (arg2 <= 107) {
            return true;
         } else {
            ++field5509;
            return (arg0 & 65536) != 0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5513[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3149(int arg0) {
      try {
         field5510 = null;
         field5505 = null;
         if (arg0 != 0) {
            field5505 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5513[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3150(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3151(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
