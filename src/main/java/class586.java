import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class586 {
   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8475 = new String[]{method4348(method4347("A\u001c!|O")), method4348(method4347("_\u001ccR")), method4348(method4347("JG!\u0010\u001a")), method4348(method4347("A\u001c!zO")), method4348(method4347("A\u001c!J\bb\u001d}W\tVA")), method4348(method4347("A\u001c!}O")), method4348(method4347("A\u001c!\u007fO")), method4348(method4347("A\u001c!{O"))};
   @OriginalMember(
      owner = "client!pu",
      name = "f",
      descriptor = "Lpu;"
   )
   public static class586 field8468 = new class586();
   @OriginalMember(
      owner = "client!pu",
      name = "g",
      descriptor = "Lpu;"
   )
   public static class586 field8471 = new class586();
   @OriginalMember(
      owner = "client!pu",
      name = "h",
      descriptor = "Lpu;"
   )
   public static class586 field8472 = new class586();
   @OriginalMember(
      owner = "client!pu",
      name = "b",
      descriptor = "Lpu;"
   )
   public static class586 field8473 = new class586();
   @OriginalMember(
      owner = "client!pu",
      name = "j",
      descriptor = "Lgh;"
   )
   public static class572 field8474 = new class572(12, 2);
   @OriginalMember(
      owner = "client!pu",
      name = "d",
      descriptor = "I"
   )
   public static int field8465;
   @OriginalMember(
      owner = "client!pu",
      name = "i",
      descriptor = "I"
   )
   public static int field8466;
   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "I"
   )
   public static int field8467;
   @OriginalMember(
      owner = "client!pu",
      name = "c",
      descriptor = "I"
   )
   public static int field8469;
   @OriginalMember(
      owner = "client!pu",
      name = "e",
      descriptor = "I"
   )
   public static int field8470;

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(ILha;)V",
      line = 3
   )
   public static final void method4342(int arg0, class65 arg1) {
      try {
         if (arg0 != 16711935) {
            method4343(74, (class35)null);
         }

         ++field8466;
         if (!class234.field3420) {
            class48.method600(arg1, 19154);
         } else {
            class44.method555(arg1, (byte)125);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8475[7] + arg0 + ',' + (arg1 != null ? field8475[2] : field8475[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(ILrk;)V",
      line = 23
   )
   public static final void method4343(int arg0, class35 arg1) {
      try {
         ++field8465;
         if (class453.field6630 == null) {
            class170 var2 = new class170();
            byte[] var3 = var2.method1531(16, 128, 128, 110);
            class453.field6630 = class194.method1687(false, -137, var3);
         }

         if (class296.field4152 == null) {
            class331 var4 = new class331();
            byte[] var5 = var4.method2569(16, 128, 128, (byte)-123);
            class296.field4152 = class194.method1687(false, -137, var5);
         }

         class442 var6 = arg1.field729;
         if (var6.method3325(35632) && class492.field7166 == null) {
            byte[] var7 = class728.method5260(8, 128, 16, 0.6F, 128, new class415(419684), 16.0F, 4.0F, 0.5F, 4.0F, -125);
            class492.field7166 = class194.method1687(false, -137, var7);
         }

         if (arg0 < 76) {
            method4345((byte)80, true, -31);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8475[3] + arg0 + ',' + (arg1 != null ? field8475[2] : field8475[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(IBII)I",
      line = 74
   )
   public static final int method4344(int arg0, byte arg1, int arg2, int arg3) {
      try {
         if (arg1 <= 51) {
            method4346(-20);
         }

         ++field8469;
         int var7 = ((arg0 & 65280) * arg3 & 16711680 | -16711936 & (arg0 & 16711935) * arg3) >>> 8;
         int var4 = -arg3 + 255;
         return (((arg2 & 16711935) * var4 & -16711936 | (arg2 & 65280) * var4 & 16711680) >>> 8) + var7;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8475[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(BZI)I",
      line = 88
   )
   public static final int method4345(byte arg0, boolean arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         ++field8467;
         if (arg1) {
            return 0;
         } else {
            class349 var4 = class190.method1656((byte)58, arg1, arg2);
            if (var4 == null) {
               return class511.field7468.method4840(arg2, 5).field5657;
            } else {
               int var5 = -69 % ((arg0 - -26) / 38);
               int var6 = 0;
               int var7 = 0;
               if (var3) {
                  if (~var4.field4963[var7] == 0) {
                     ++var6;
                  }

                  ++var7;
               }

               while(true) {
                  while(~var4.field4963.length < ~var7) {
                     if (~var4.field4963[var7] == 0) {
                        ++var6;
                     }

                     ++var7;
                  }

                  var6 += class511.field7468.method4840(arg2, 5).field5657 - var4.field4963.length;
                  if (!var3) {
                     return var6;
                  }

                  if (var6 == 0) {
                     ++var6;
                  }

                  ++var7;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8475[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 121
   )
   public final String toString() {
      try {
         ++field8470;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8475[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(I)V",
      line = 129
   )
   public static void method4346(int arg0) {
      try {
         field8471 = null;
         field8473 = null;
         field8468 = null;
         field8472 = null;
         if (arg0 >= -94) {
            method4346(-65);
         }

         field8474 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8475[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4347(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4348(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
