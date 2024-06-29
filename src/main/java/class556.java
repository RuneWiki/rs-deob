import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class556 {
   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7902 = new String[]{method4146(method4145("\u001aJTgFG")), method4146(method4145("\u001aJTgGG")), method4146(method4145("\u001aJTgAG")), method4146(method4145("\u001aJTgDG"))};
   @OriginalMember(
      owner = "client!uaa",
      name = "e",
      descriptor = "Lfm;"
   )
   public static class164 field7898 = new class164(15, 15);
   @OriginalMember(
      owner = "client!uaa",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field7900 = false;
   @OriginalMember(
      owner = "client!uaa",
      name = "b",
      descriptor = "Ldi;"
   )
   public static class577 field7899 = new class577(1, 2);
   @OriginalMember(
      owner = "client!uaa",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field7901 = null;
   @OriginalMember(
      owner = "client!uaa",
      name = "c",
      descriptor = "I"
   )
   public static int field7895;
   @OriginalMember(
      owner = "client!uaa",
      name = "f",
      descriptor = "I"
   )
   public static int field7896;
   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "I"
   )
   public static int field7897;

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4141(int arg0, int arg1, int arg2) {
      try {
         ++field7897;
         if (arg2 != 0) {
            return true;
         } else {
            return (arg0 & 458752) != 0 | class388.method3024(arg1, arg0, (byte)2) || class201.method1749(arg1, arg0, 200);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7902[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(IJ)V"
   )
   public static final void method4142(int arg0, long arg1) {
      boolean var3 = client.field10022;

      try {
         if (class324.field4826 != null) {
            label75: {
               if (class306.field4639 != 1 && class306.field4639 != 5) {
                  if (~class306.field4639 != -5) {
                     break label75;
                  }

                  class539.method4016(arg1, 11743);
                  if (!var3) {
                     break label75;
                  }
               }

               class183.method1653((byte)-8, arg1);
            }
         }

         ++field7895;
         class152.method1473((long)class51.field770, class54.field794, -128);
         if (arg0 > -53) {
            field7901 = null;
         }

         if (class7.field130 != -1) {
            class550.method4126(class7.field130, true);
         }

         int var4 = 0;
         if (var3) {
            if (class417.field6107[var4]) {
               class55.field798[var4] = true;
            }

            class15.field210[var4] = class417.field6107[var4];
            class417.field6107[var4] = false;
            ++var4;
         }

         while(true) {
            int var10000;
            if (var4 >= class766.field10999) {
               class70.field1024 = class51.field770;
               class48.method531((byte)-112, (class91)null, -1, -1);
               class341.method2713(-1, (class91)null, -1, 0);
               var10000 = ~class7.field130;
               if (!var3) {
                  if (var10000 != 0) {
                     class766.field10999 = 0;
                     class388.method3026((byte)-2);
                  }

                  class54.field794.method231();
                  class744.method5358(class54.field794, (byte)57);
                  int var5 = class207.method1783((byte)-114);
                  if (~var5 == 0) {
                     var5 = class357.field5276;
                  }

                  if (~var5 == 0) {
                     var5 = class316.field4726;
                  }

                  class798.method5750(var5, 0);
                  int var6 = class117.field1849.method1507(-78) << 8;
                  class186.method1675(class117.field1849.field6832 + var6, class117.field1849.field6824, class327.field4859, false, class117.field1849.field6833 + var6);
                  class327.field4859 = 0;
                  return;
               }
            } else {
               var10000 = class417.field6107[var4];
            }

            if (var10000 != 0) {
               class55.field798[var4] = true;
            }

            class15.field210[var4] = class417.field6107[var4];
            class417.field6107[var4] = false;
            ++var4;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7902[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4143(int arg0) {
      try {
         field7901 = null;
         if (arg0 != -19022) {
            method4143(35);
         }

         field7898 = null;
         field7899 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7902[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(IBIIII)V"
   )
   public static final void method4144(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field7896;
         if (arg1 != -66) {
            method4144(-67, (byte)-104, -69, -22, -28, 125);
         }

         if (~arg2 == ~arg5) {
            class456.method3517(arg2, arg3, (byte)-46, arg0, arg4);
         } else if (~class729.field10384 >= ~(-arg2 + arg4) && ~(arg2 + arg4) >= ~class604.field8618 && -arg5 + arg0 >= class587.field8239 && class767.field11011 >= arg0 + arg5) {
            class525.method3938(arg5, arg3, (byte)30, arg0, arg4, arg2);
         } else {
            class229.method2039(arg3, arg0, arg4, arg2, arg5, (byte)17);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7902[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4145(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4146(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
