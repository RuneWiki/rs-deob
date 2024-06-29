import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class400 {
   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5504 = new String[]{method3143(method3142("4K#\u007f")), method3143(method3142("+V.=gr")), method3143(method3142("!\u0010a=^")), method3143(method3142("+V.=br")), method3143(method3142("+V.=`r")), method3143(method3142("+V.=ar"))};
   @OriginalMember(
      owner = "client!qha",
      name = "b",
      descriptor = "Lse;"
   )
   public static class6 field5495 = new class6(16, -1);
   @OriginalMember(
      owner = "client!qha",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field5500 = false;
   @OriginalMember(
      owner = "client!qha",
      name = "i",
      descriptor = "Lfea;"
   )
   public static class681 field5501 = new class681(8, 0, 4, 1);
   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "Laka;"
   )
   public static class418 field5503 = new class418(78, 10);
   @OriginalMember(
      owner = "client!qha",
      name = "g",
      descriptor = "I"
   )
   public static int field5496;
   @OriginalMember(
      owner = "client!qha",
      name = "e",
      descriptor = "I"
   )
   public static int field5497;
   @OriginalMember(
      owner = "client!qha",
      name = "d",
      descriptor = "I"
   )
   public static int field5499;
   @OriginalMember(
      owner = "client!qha",
      name = "c",
      descriptor = "Lww;"
   )
   public static class339 field5498;
   @OriginalMember(
      owner = "client!qha",
      name = "h",
      descriptor = "Lpd;"
   )
   public static class648 field5502;

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3138(int arg0, int arg1) {
      try {
         ++field5499;
         if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
         }

         class323.field4426 = arg1;
         class598.field8836 = new class619[class392.field5433[class323.field4426] + 1];
         class699.field10229 = 0;
         class225.field2818 = 0;
         if (arg0 != 10) {
            field5498 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5504[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public static final void method3139(int arg0, class66 arg1) {
      boolean var2 = client.field1481;

      try {
         if (arg0 < 61) {
            field5502 = null;
         }

         ++field5496;
         int var3 = arg1.method653((byte)-114);
         class602.field8870 = new class379[var3];
         int var4 = 0;
         if (var2) {
            class602.field8870[var4] = new class379();
            class602.field8870[var4].field5269 = arg1.method653((byte)-79);
            class602.field8870[var4].field5271 = arg1.method613((byte)-81);
            ++var4;
         }

         while(true) {
            while(var3 > var4) {
               class602.field8870[var4] = new class379();
               class602.field8870[var4].field5269 = arg1.method653((byte)-79);
               class602.field8870[var4].field5271 = arg1.method613((byte)-81);
               ++var4;
            }

            class503.field6992 = arg1.method653((byte)70);
            class568.field8356 = arg1.method653((byte)-110);
            class54.field744 = arg1.method653((byte)80);
            class490.field6838 = new class111[-class503.field6992 + 1 + class568.field8356];
            int var5 = 0;
            if (!var2) {
               int var10000;
               if (var2) {
                  var10000 = arg1.method653((byte)-78);
               } else if (class54.field744 <= var5) {
                  class410.field5650 = arg1.method610(125);
                  var10000 = 1;
                  if (!var2) {
                     class504.field7037 = true;
                     return;
                  }
               } else {
                  var10000 = arg1.method653((byte)-78);
               }

               while(true) {
                  int var6 = var10000;
                  class111 var7 = class490.field6838[var6] = new class111();
                  var7.field8337 = arg1.method640(255);
                  var7.field8332 = arg1.method610(124);
                  var7.field1488 = class503.field6992 + var6;
                  var7.field1487 = arg1.method613((byte)-81);
                  var7.field1485 = arg1.method613((byte)-81);
                  ++var5;
                  if (class54.field744 <= var5) {
                     class410.field5650 = arg1.method610(125);
                     var10000 = 1;
                     if (!var2) {
                        class504.field7037 = true;
                        return;
                     }
                  } else {
                     var10000 = arg1.method653((byte)-78);
                  }
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field5504[1] + arg0 + ',' + (arg1 != null ? field5504[2] : field5504[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3140(boolean arg0) {
      try {
         if (~class396.field5471 != 0) {
            class467.method3550(false, -1, 127, class396.field5471, -1);
            class396.field5471 = -1;
         }

         if (!arg0) {
            method3139(-98, (class66)null);
         }

         ++field5497;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5504[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3141(int arg0) {
      try {
         field5503 = null;
         field5498 = null;
         field5501 = null;
         field5495 = null;
         field5502 = null;
         if (arg0 != 57) {
            method3139(20, (class66)null);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5504[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3142(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3143(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
