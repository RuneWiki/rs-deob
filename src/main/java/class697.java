import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class697 {
   @OriginalMember(
      owner = "client!aga",
      name = "c",
      descriptor = "I"
   )
   private int field10175;
   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10182 = new String[]{method5073(method5072("\u0002\u0016\u0017]")), method5073(method5072("\r\u0004\u001a\u001f'D")), method5073(method5072("\u0017MU\u001f\u001f")), method5073(method5072("\r\u0004\u001a\u001f&D")), method5073(method5072("\r\u0004\u001a\u001f^\u0005\r\u0012E\\D")), method5073(method5072("\r\u0004\u001a\u001f$D")), method5073(method5072("\r\u0004\u001a\u001f%D")), method5073(method5072("\r\u0004\u001a\u001f!D")), method5073(method5072("\r\u0004\u001a\u001f D")), method5073(method5072("\r\u0004\u001a\u001f#D"))};
   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field10178 = new int[]{1, 4, 1, 2};
   @OriginalMember(
      owner = "client!aga",
      name = "h",
      descriptor = "I"
   )
   public static int field10173;
   @OriginalMember(
      owner = "client!aga",
      name = "f",
      descriptor = "I"
   )
   public static int field10174;
   @OriginalMember(
      owner = "client!aga",
      name = "b",
      descriptor = "I"
   )
   public static int field10176;
   @OriginalMember(
      owner = "client!aga",
      name = "i",
      descriptor = "I"
   )
   public static int field10177;
   @OriginalMember(
      owner = "client!aga",
      name = "g",
      descriptor = "I"
   )
   public static int field10179;
   @OriginalMember(
      owner = "client!aga",
      name = "d",
      descriptor = "I"
   )
   public static int field10180;
   @OriginalMember(
      owner = "client!aga",
      name = "e",
      descriptor = "I"
   )
   public static int field10181;

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public static final void method5065(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10174;
         int var5 = class463.field6353;
         int var6 = class233.field2887;
         if (class775.field11283) {
            var5 += class101.method916(47);
            var6 += class291.method2190(53);
         }

         if (~class430.field6007 == -2) {
            class763 var7 = class528.field7216[class172.field2152 / 100];
            var7.method5482(var5 - 8, var6 - 8);
            class534.method3842(0, var7.method2125() + (var5 - 8), -8 + var6 + var7.method2129(), var6 + -8, var5 + -8);
         }

         if (class430.field6007 == 2) {
            class763 var8 = class528.field7216[4 - -(class172.field2152 / 100)];
            var8.method5482(var5 + -8, var6 - 8);
            class534.method3842(0, var8.method2125() + -8 + var5, -8 + (var6 - -var8.method2129()), var6 + -8, var5 - 8);
         }

         if (arg0 >= -119) {
            field10180 = 32;
         }

         class46.method394(false);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field10182[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(Lha;ILqc;I)V"
   )
   public static final void method5066(class65 param0, int param1, class777 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5067(int arg0) {
      try {
         if (arg0 == 1) {
            field10178 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10182[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5068(byte arg0) {
      try {
         OpenGL.glEndList();
         ++field10173;
         if (arg0 != 119) {
            this.method5069(-54, -43);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10182[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5069(int arg0, int arg1) {
      try {
         int var3 = -98 / ((arg0 - 70) / 38);
         OpenGL.glNewList(this.field10175 + arg1, 4864);
         ++field10179;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10182[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(CI)V"
   )
   public final void method5070(char arg0, int arg1) {
      try {
         OpenGL.glCallList(this.field10175 + arg0);
         ++field10181;
         if (arg1 != 4) {
            field10180 = -22;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10182[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(BIIIZ)V"
   )
   public static final void method5071(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field10177;
         class773.method5531(-3023);
         class51.field569 = 0L;
         int var5 = class600.method4374(123);
         if (arg2 == 3 || ~var5 == -4) {
            arg4 = true;
         }

         if (!class338.field4832.method566()) {
            arg4 = true;
         }

         class390.method2966(arg3, arg1, (byte)121, arg2, var5, arg4);
         if (arg0 < 72) {
            field10180 = 67;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10182[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "<init>",
      descriptor = "(Lor;I)V"
   )
   public class697(class670 arg0, int arg1) {
      try {
         this.field10175 = OpenGL.glGenLists(arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10182[4] + (arg0 != null ? field10182[2] : field10182[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5072(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5073(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
