import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class640 {
   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9021 = new String[]{method4637(method4636("8Bh:9")), method4637(method4636("8Bh99")), method4637(method4636("<^*\u0014")), method4637(method4636(")\u0005hVl"))};
   @OriginalMember(
      owner = "client!ji",
      name = "b",
      descriptor = "I"
   )
   public static int field9018 = -1;
   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "I"
   )
   public static int field9019;
   @OriginalMember(
      owner = "client!ji",
      name = "c",
      descriptor = "I"
   )
   public static int field9020;

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4634(byte arg0) {
      boolean var1 = client.field4273;

      try {
         if (arg0 != 3) {
            field9018 = -121;
         }

         ++field9020;
         int var2 = 0;
         if (var1 || var2 < class56.field610) {
            do {
               class693 var3 = class701.field10206[var2];
               if (var3.field10118 == 3) {
                  if (var3.field10123 == null) {
                     var3.field10112 = Integer.MIN_VALUE;
                     if (var1) {
                        class717.field10509.method2175(var3.field10123);
                        ++var2;
                     } else {
                        ++var2;
                     }
                  } else {
                     class717.field10509.method2175(var3.field10123);
                     ++var2;
                  }
               } else {
                  ++var2;
               }
            } while(var2 < class56.field610);

         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9021[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(IIIZILqh;B)V"
   )
   public static final void method4635(int arg0, int arg1, int arg2, boolean arg3, int arg4, class74 arg5, byte arg6) {
      try {
         label30: {
            if (arg2 <= 0) {
               class307.method2305(arg4, arg3, (byte)112, arg5, arg1, arg0);
               if (!client.field4273) {
                  break label30;
               }
            }

            class449.field6210 = 1;
            class382.field5353 = arg3;
            class188.field2305 = arg5;
            class370.field5220 = arg0;
            class671.field9870 = arg1;
            class104.field1328 = arg4;
            class728.field10669 = null;
            class479.field6625 = class131.field1647.method670(22486) / arg2;
            if (~class479.field6625 > -2) {
               class479.field6625 = 1;
            }
         }

         ++field9019;
         if (arg6 <= 66) {
            field9018 = 97;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field9021[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9021[3] : field9021[2]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4636(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4637(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
