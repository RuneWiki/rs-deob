import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class690 {
   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10255 = new String[]{method5087(method5086("\u001d\rZ^\u000e")), method5087(method5086("\u001d\rZ_\u000e")), method5087(method5086("\u001d\rZ]\u000e")), method5087(method5086("\u0016\u0002\u0004-\u0006\u0001\u0003\u0007&")), method5087(method5086("\u0016\u0002\u0004.\u0006\u0001\u0003\u0007&")), method5087(method5086("\u0016\u0002\u0004/\u0006\u001c\u0005\u0007&")), method5087(method5086("\u0016\u0002\u0004(\u0006\u0004\u0007N")), method5087(method5086("Q\u001c\u0007u\\\u0014V")), method5087(method5086("Q\u001f\u001dfCK")), method5087(method5086("\u001d\rZX\u000e"))};
   @OriginalMember(
      owner = "client!la",
      name = "c",
      descriptor = "Lnaa;"
   )
   public static class113 field10252 = new class113(41, 7);
   @OriginalMember(
      owner = "client!la",
      name = "d",
      descriptor = "Luk;"
   )
   public static class498 field10253 = new class498(17, -1);
   @OriginalMember(
      owner = "client!la",
      name = "h",
      descriptor = "I"
   )
   public static int field10246;
   @OriginalMember(
      owner = "client!la",
      name = "e",
      descriptor = "I"
   )
   public static int field10247;
   @OriginalMember(
      owner = "client!la",
      name = "b",
      descriptor = "I"
   )
   public static int field10249;
   @OriginalMember(
      owner = "client!la",
      name = "f",
      descriptor = "Lr;"
   )
   public class273 field10248;
   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "Lrr;"
   )
   public static class678 field10251;
   @OriginalMember(
      owner = "client!la",
      name = "i",
      descriptor = "Lau;"
   )
   public static class736 field10254;
   @OriginalMember(
      owner = "client!la",
      name = "g",
      descriptor = "Lka;"
   )
   public class91 field10250;

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static final void method5082(byte arg0) {
      boolean var1 = client.field1786;

      try {
         if (~class176.field2763 <= -1) {
            long var2;
            label52: {
               var2 = class162.method1442(14080);
               class176.field2763 = (int)((long)class176.field2763 - (-class614.field8921 + var2));
               if (~class176.field2763 < -1) {
                  int var4 = (class176.field2763 << 8) / class28.field341;
                  int var5 = -var4 + 255;
                  float var6 = (float)var4 / 255.0F;
                  float var7 = 1.0F - var6;
                  class152.field2281 = ((class674.field10030 & 16711935) * var4 + (16711935 & class332.field5022.field5637) * var5 & -16711936) - -((65280 & class674.field10030) * var4 + (class332.field5022.field5637 & 65280) * var5 & 16711680) >>> 8;
                  class699.field10389 = (-class693.field10310 + class332.field5022.field5635) * var7 + class693.field10310;
                  class487.field7399 = class246.field3728 * var4 - -(class332.field5022.field5636 * var5) >> 8;
                  class573.field8481 = (-class81.field1153 + class332.field5022.field5649) * var7 + class81.field1153;
                  class607.field8855 = (16711680 & (class799.field11638 & 65280) * var4 + (class332.field5022.field5651 & 65280) * var5) + ((16711935 & class799.field11638) * var4 + (class332.field5022.field5651 & 16711935) * var5 & -16711936) >>> 8;
                  class645.field9313 = (-class605.field8837 + class332.field5022.field5640) * var7 + class605.field8837;
                  class786.field11528 = (class332.field5022.field5631 - class360.field5563) * var7 + class360.field5563;
                  class365.field5645 = (-class117.field1568 + class332.field5022.field5650) * var7 + class117.field1568;
                  class751.field11147 = (class332.field5022.field5646 - class474.field7213) * var7 + class474.field7213;
                  if (class585.field8658 != class332.field5022.field5647) {
                     class376.field5983 = class659.field9850.method603(class585.field8658, class332.field5022.field5647, var7, class376.field5983);
                  }

                  if (class119.field1632 == class332.field5022.field5632) {
                     break label52;
                  }

                  if (class119.field1632 == null) {
                     class354.field5400 = class332.field5022.field5632;
                     if (class354.field5400 == null) {
                        break label52;
                     }

                     class354.field5400.method3391(var5, 0, (byte)-37);
                     if (!var1) {
                        break label52;
                     }
                  }

                  class354.field5400 = class119.field1632;
                  if (class354.field5400 == null) {
                     break label52;
                  }

                  class354.field5400.method3391(var5, 255, (byte)-127);
                  if (!var1) {
                     break label52;
                  }
               }

               class487.field7399 = class332.field5022.field5636;
               class751.field11147 = class332.field5022.field5646;
               class786.field11528 = class332.field5022.field5631;
               class607.field8855 = class332.field5022.field5651;
               class376.field5983 = class332.field5022.field5647;
               class699.field10389 = class332.field5022.field5635;
               class152.field2281 = class332.field5022.field5637;
               class645.field9313 = class332.field5022.field5640;
               class573.field8481 = class332.field5022.field5649;
               class365.field5645 = class332.field5022.field5650;
               if (class354.field5400 != null) {
                  class354.field5400.method3387(0);
               }

               class354.field5400 = class332.field5022.field5632;
               class176.field2763 = -1;
            }

            class614.field8921 = var2;
         }

         ++field10247;
         int var8 = -123 % ((arg0 - -18) / 62);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field10255[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(I)V",
      line = 91
   )
   public static final void method5083(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!la",
      name = "b",
      descriptor = "(I)V",
      line = 180
   )
   public static void method5084(int arg0) {
      try {
         field10253 = null;
         field10254 = null;
         field10251 = null;
         field10252 = null;
         if (arg0 != -1) {
            field10254 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10255[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(IIIZIII)V",
      line = 197
   )
   public static final void method5085(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
      try {
         label29: {
            if (~(-arg0 + arg1) <= ~class443.field6806 && ~class182.field2833 <= ~(arg1 - -arg0) && class368.field5724 <= -arg0 + arg4 && ~class84.field1212 <= ~(arg0 + arg4)) {
               class58.method431(arg1, arg0, arg4, 2, arg6, arg5, arg2);
               if (!client.field1786) {
                  break label29;
               }
            }

            class523.method4041(arg0, arg4, arg5, (byte)-124, arg1, arg2, arg6);
         }

         if (!arg3) {
            ++field10246;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field10255[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5086(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5087(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
