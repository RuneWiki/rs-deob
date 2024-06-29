import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class336 {
   @OriginalMember(
      owner = "client!uea",
      name = "d",
      descriptor = "Loi;"
   )
   private class80 field4573 = new class80(64);
   @OriginalMember(
      owner = "client!uea",
      name = "f",
      descriptor = "Lkf;"
   )
   private class266 field4571;
   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4579 = new String[]{method2480(method2479("4U>\u0005%")), method2480(method2479(":\u001eq\u0005\u001eg")), method2480(method2479("!\u000e|G")), method2480(method2479(":\u001eq\u0005\u001dg")), method2480(method2479(":\u001eq\u0005\u0019g")), method2480(method2479(":\u001eq\u0005\u001bg")), method2480(method2479(":\u001eq\u0005\u001cg")), method2480(method2479(":\u001eq\u0005d&\u0015y_fg")), method2480(method2479(":\u001eq\u0005\u001ag"))};
   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "Lqca;"
   )
   public static class127 field4574 = new class127(1, 2);
   @OriginalMember(
      owner = "client!uea",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field4577 = new int[2];
   @OriginalMember(
      owner = "client!uea",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field4576 = new int[2];
   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field4578 = false;
   @OriginalMember(
      owner = "client!uea",
      name = "h",
      descriptor = "I"
   )
   public static int field4568;
   @OriginalMember(
      owner = "client!uea",
      name = "j",
      descriptor = "I"
   )
   public static int field4569;
   @OriginalMember(
      owner = "client!uea",
      name = "c",
      descriptor = "I"
   )
   public static int field4570;
   @OriginalMember(
      owner = "client!uea",
      name = "g",
      descriptor = "I"
   )
   public static int field4572;
   @OriginalMember(
      owner = "client!uea",
      name = "e",
      descriptor = "I"
   )
   public static int field4575;

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(ILcl;I)V"
   )
   public static final void method2473(int param0, class279 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2474(byte arg0) {
      try {
         field4574 = null;
         field4576 = null;
         field4577 = null;
         if (arg0 != -127) {
            method2474((byte)-6);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4579[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method2475(byte arg0, int arg1) {
      try {
         int var3 = -64 % ((8 - arg0) / 55);
         class80 var4 = this.field4573;
         synchronized(this.field4573) {
            this.field4573.method726(arg1, 25324);
         }

         ++field4575;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4579[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(IB)Lng;"
   )
   public final class362 method2476(int arg0, byte arg1) {
      try {
         ++field4570;
         class80 var3 = this.field4573;
         class362 var4;
         synchronized(this.field4573) {
            var4 = (class362)this.field4573.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field4571;
            byte[] var6;
            synchronized(this.field4571) {
               var6 = this.field4571.method2037(false, arg0, 35);
            }

            class362 var7 = new class362();
            if (var6 != null) {
               var7.method2708(new class147(var6), (byte)-23);
            }

            var7.method2711(80);
            class80 var8 = this.field4573;
            synchronized(this.field4573) {
               if (arg1 > -95) {
                  method2474((byte)65);
               }

               this.field4573.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field4579[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2477(byte arg0) {
      try {
         class80 var2 = this.field4573;
         synchronized(this.field4573) {
            this.field4573.method715(true);
         }

         if (arg0 != -1) {
            method2474((byte)17);
         }

         ++field4569;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4579[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2478(int arg0) {
      try {
         ++field4568;
         class80 var2 = this.field4573;
         synchronized(this.field4573) {
            this.field4573.method731(0);
            if (arg0 != -16541) {
               this.field4573 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4579[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V"
   )
   public class336(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field4571 = arg2;
         if (this.field4571 != null) {
            this.field4571.method2060(2, 35);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4579[7] + (arg0 != null ? field4579[0] : field4579[2]) + ',' + arg1 + ',' + (arg2 != null ? field4579[0] : field4579[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2479(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2480(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
