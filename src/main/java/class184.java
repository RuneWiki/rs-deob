import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public abstract class class184 extends class76 {
   @OriginalMember(
      owner = "client!cda",
      name = "F",
      descriptor = "Z"
   )
   public volatile boolean field2586 = true;
   @OriginalMember(
      owner = "client!cda",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2592 = new String[]{method1468(method1467("WfB\u001el\u001c")), method1468(method1467("WfB\u001em\u001c"))};
   @OriginalMember(
      owner = "client!cda",
      name = "B",
      descriptor = "Lno;"
   )
   public static class732 field2591 = new class732(method1468(method1467("ScNU\u001f")), method1468(method1467("scNU\u000b\u0000")), 3);
   @OriginalMember(
      owner = "client!cda",
      name = "D",
      descriptor = "I"
   )
   public static int field2585;
   @OriginalMember(
      owner = "client!cda",
      name = "E",
      descriptor = "Lvca;"
   )
   public static class296 field2590;
   @OriginalMember(
      owner = "client!cda",
      name = "C",
      descriptor = "Ljha;"
   )
   public static class725 field2587;
   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "Z"
   )
   public boolean field2588;
   @OriginalMember(
      owner = "client!cda",
      name = "A",
      descriptor = "Z"
   )
   public boolean field2589;

   @OriginalMember(
      owner = "client!cda",
      name = "c",
      descriptor = "(B)I"
   )
   public abstract int method1462(byte arg0);

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "()V"
   )
   public static final void method1463() {
      class508.method3693(1, class154.field2185);
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(Z)[B"
   )
   public abstract byte[] method1464(boolean arg0);

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(IIIZII)V"
   )
   public static final void method1465(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
      boolean var6 = client.field4360;

      try {
         if (arg1 == -10845) {
            ++field2585;
            long var7 = (long)((!arg3 ? 0 : Integer.MIN_VALUE) | arg5);
            class111 var9 = (class111)class743.field10831.method329((byte)109, var7);
            if (var9 == null) {
               var9 = new class111();
               class743.field10831.method336(-1, var7, var9);
            }

            if (var9.field1391.length <= arg0) {
               int[] var10 = new int[arg0 + 1];
               int[] var11 = new int[arg0 + 1];
               int var12 = 0;
               if (var6) {
                  var10[var12] = var9.field1391[var12];
                  var11[var12] = var9.field1396[var12];
                  ++var12;
               }

               label70:
               while(true) {
                  while(~var9.field1391.length < ~var12) {
                     var10[var12] = var9.field1391[var12];
                     var11[var12] = var9.field1396[var12];
                     ++var12;
                  }

                  int var13 = var9.field1391.length;
                  if (!var6) {
                     if (var6) {
                        var10[var13] = -1;
                        var11[var13] = 0;
                        ++var13;
                     }

                     while(true) {
                        while(~var13 > ~arg0) {
                           var10[var13] = -1;
                           var11[var13] = 0;
                           ++var13;
                        }

                        var9.field1396 = var11;
                        if (!var6) {
                           var9.field1391 = var10;
                           break label70;
                        }

                        ++var13;
                     }
                  }

                  ++var12;
               }
            }

            var9.field1391[arg0] = arg4;
            var9.field1396[arg0] = arg2;
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field2592[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1466(int arg0) {
      try {
         field2591 = null;
         field2590 = null;
         field2587 = null;
         if (arg0 <= 97) {
            field2590 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2592[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1467(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1468(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
