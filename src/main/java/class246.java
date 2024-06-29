import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class246 {
   @OriginalMember(
      owner = "client!lb",
      name = "g",
      descriptor = "Ltia;"
   )
   public class208 field3729 = new class208();
   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "Z"
   )
   public boolean field3731 = false;
   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3732 = new String[]{method2094(method2093("50'X")), method2094(method2093(" ke\u001a]")), method2094(method2093("7'ew\b")), method2094(method2093("7'ev\b")), method2094(method2093("7'ep\b")), method2094(method2093(",7")), method2094(method2093("7'e\bI5,?\n\b")), method2094(method2093("7'eq\b")), method2094(method2093("7'eu\b"))};
   @OriginalMember(
      owner = "client!lb",
      name = "e",
      descriptor = "J"
   )
   public static long field3724 = -1L;
   @OriginalMember(
      owner = "client!lb",
      name = "b",
      descriptor = "J"
   )
   public static long field3727 = 1L;
   @OriginalMember(
      owner = "client!lb",
      name = "h",
      descriptor = "I"
   )
   public static int field3722;
   @OriginalMember(
      owner = "client!lb",
      name = "d",
      descriptor = "I"
   )
   public static int field3723;
   @OriginalMember(
      owner = "client!lb",
      name = "i",
      descriptor = "I"
   )
   public static int field3725;
   @OriginalMember(
      owner = "client!lb",
      name = "c",
      descriptor = "I"
   )
   public static int field3728;
   @OriginalMember(
      owner = "client!lb",
      name = "j",
      descriptor = "I"
   )
   public static int field3730;
   @OriginalMember(
      owner = "client!lb",
      name = "f",
      descriptor = "Ltm;"
   )
   public static class406 field3726;

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(Lha;IIIIIIZZ)V",
      line = 5
   )
   public static final void method2087(class610 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
      class546.field8193 = arg0;
      class774.field11384 = arg1;
      class116.field1566 = class774.field11384 > 1 && class546.field8193.method587();
      class394.field6180 = arg2;
      class678.field10091 = 1 << class394.field6180;
      class42.field564 = class678.field10091 >> 1;
      Math.sqrt((double)(class42.field564 * class42.field564 + class42.field564 * class42.field564));
      class461.field7016 = arg3;
      class247.field3734 = arg4;
      class365.field5634 = arg5;
      class382.field6038 = arg6;
      class754.field11176 = class707.method5216(-23348);
      class287.method2395((byte)-54);
      class459.field7003 = new class190[arg3][class247.field3734][class365.field5634];
      class96.field1355 = new class271[arg3];
      if (arg7) {
         class284.field4485 = new int[class247.field3734][class365.field5634];
         class191.field2968 = new byte[class247.field3734][class365.field5634];
         class183.field2879 = new short[class247.field3734][class365.field5634];
         class459.field7006 = new class190[1][class247.field3734][class365.field5634];
         class190.field2949 = new class271[1];
      } else {
         class284.field4485 = null;
         class191.field2968 = null;
         class183.field2879 = null;
         class459.field7006 = null;
         class190.field2949 = null;
      }

      if (arg8) {
         class226.field3439 = new long[arg3][arg4][arg5];
         class88.field1276 = new class330[65535];
         class701.field10454 = new boolean[65535];
         class213.field3240 = 0;
      } else {
         class226.field3439 = null;
         class88.field1276 = null;
         class701.field10454 = null;
         class213.field3240 = 0;
      }

      class19.method142(false);
      class6.field36 = new class109[2];
      class777.field11406 = new class109[2];
      class651.field9383 = new class109[2];
      class478.field7280 = new class109[10000];
      class711.field10690 = 0;
      class19.field241 = new class109[5000];
      class127.field1832 = 0;
      class395.field6195 = new class78[5000];
      class108.field1485 = 0;
      class717.field10755 = new boolean[class382.field6038 + class382.field6038 + 1][class382.field6038 + class382.field6038 + 1];
      class247.field3755 = new boolean[class382.field6038 + class382.field6038 + 2][class382.field6038 + class382.field6038 + 2];
      class56.field691 = new int[class382.field6038 + class382.field6038 + 2];
      class154.field2298 = class154.field2299;
      if (class116.field1566) {
         class392.field6153 = new boolean[arg3][class382.field6038 + class382.field6038 + 1][class382.field6038 + class382.field6038 + 1];
         class312.field4842 = new boolean[arg3][][];
         if (class238.field3620 != null) {
            class234.method2014();
         }

         class238.field3620 = new class533[class774.field11384];
         class546.field8193.method685(class238.field3620.length + 1);
         class546.field8193.method676(0);

         for(int var9 = 0; var9 < class238.field3620.length; ++var9) {
            class238.field3620[var9] = new class533(var9 + 1, class546.field8193);
            (new Thread(class238.field3620[var9], field3732[5] + var9)).start();
         }

         byte var10;
         if (class774.field11384 == 2) {
            var10 = 4;
            class571.field8459 = 2;
         } else if (class774.field11384 == 3) {
            var10 = 6;
            class571.field8459 = 3;
         } else {
            var10 = 8;
            class571.field8459 = 4;
         }

         class659.field9842 = new class451[var10];

         for(int var11 = 0; var11 < var10; ++var11) {
            class659.field9842[var11] = new class451(class361.field5615[class774.field11384 - 2][var11]);
         }
      } else {
         class571.field8459 = 1;
      }

      class277.field4418 = new int[class571.field8459 - 1];
      class222.field3346 = new int[class571.field8459 - 1];
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(BLpga;)V",
      line = 124
   )
   public final void method2088(byte param1, class788 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(B)V",
      line = 193
   )
   public static void method2089(byte arg0) {
      try {
         field3726 = null;
         if (arg0 != -10) {
            field3727 = 116L;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3732[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(I)V",
      line = 210
   )
   public final void method2090(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field3730;

         while(true) {
            class788 var3 = (class788)this.field3729.method1812(0);
            if (var3 != null) {
               var3.method3159(true);
               class142.method1291(var3, 63);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            if (arg0 != 0) {
               field3728 = 77;
               return;
            }
            break;
         }

      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3732[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(ILica;)Ljg;",
      line = 235
   )
   public static final class787 method2091(int arg0, class354 arg1) {
      try {
         ++field3723;
         if (arg0 != 1) {
            method2092((byte)54, 104, -50);
         }

         int var2 = arg1.method2848(-118);
         return new class787(var2);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3732[2] + arg0 + ',' + (arg1 != null ? field3732[1] : field3732[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(BII)Z",
      line = 251
   )
   public static final boolean method2092(byte arg0, int arg1, int arg2) {
      try {
         ++field3722;
         if (!class756.method5544(arg2, arg1, true)) {
            return false;
         } else {
            if (arg0 != -40) {
               field3728 = 35;
            }

            return class238.method2031(arg2, arg1, 11760) | ~(45056 & arg2) != -1 | class564.method4256(arg2, -19410, arg1) ? true : (class482.method3754(false, arg2, arg1) | class757.method5553(arg1, -28284, arg2)) & ~(arg1 & 55) == -1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3732[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "<init>",
      descriptor = "(Z)V",
      line = 279
   )
   public class246(boolean arg0) {
      try {
         this.field3731 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3732[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2093(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2094(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
