import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class122 {
   @OriginalMember(
      owner = "client!jr",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field1586;
   @OriginalMember(
      owner = "client!jr",
      name = "k",
      descriptor = "I"
   )
   public int field1583;
   @OriginalMember(
      owner = "client!jr",
      name = "f",
      descriptor = "J"
   )
   public long field1577;
   @OriginalMember(
      owner = "client!jr",
      name = "d",
      descriptor = "I"
   )
   public int field1584;
   @OriginalMember(
      owner = "client!jr",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public String field1582;
   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1588 = new String[]{method991(method990("$o0q1")), method991(method990("530c%1(jad")), method991(method990("14r3")), method991(method990("530\u001bd")), method991(method990("530\u001ed")), method991(method990("2 f\u0012)2.l&")), method991(method990("5 h>b3 p8b\r4p+%2$")), method991(method990("530\u001cd")), method991(method990("530\u001dd"))};
   @OriginalMember(
      owner = "client!jr",
      name = "b",
      descriptor = "Lbl;"
   )
   public static class678 field1580 = null;
   @OriginalMember(
      owner = "client!jr",
      name = "c",
      descriptor = "I"
   )
   public static int field1585 = -1;
   @OriginalMember(
      owner = "client!jr",
      name = "e",
      descriptor = "I"
   )
   public static int field1578;
   @OriginalMember(
      owner = "client!jr",
      name = "g",
      descriptor = "I"
   )
   public static int field1579;
   @OriginalMember(
      owner = "client!jr",
      name = "j",
      descriptor = "I"
   )
   public static int field1581;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1587;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method989(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method985(int arg0) {
      try {
         field1580 = null;
         if (arg0 != 1048576) {
            field1585 = -122;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1588[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "([JB[Ljava/lang/Object;)V",
      line = 14
   )
   public static final void method986(long[] arg0, byte arg1, Object[] arg2) {
      try {
         ++field1581;
         class416.method3111(arg2, 0, arg0.length + -1, arg0, (byte)81);
         if (arg1 > -67) {
            method986((long[])null, (byte)81, (Object[])null);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1588[8] + (arg0 != null ? field1588[0] : field1588[2]) + ',' + arg1 + ',' + (arg2 != null ? field1588[0] : field1588[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(B)V",
      line = 25
   )
   public static final void method987(byte arg0) {
      try {
         label34: {
            if (class316.field4304.field9110) {
               class409.field5915 = 96;
               if (!client.field4360) {
                  break label34;
               }
            }

            try {
               Method var1 = (field1587 != null ? field1587 : (field1587 = method989(field1588[6]))).getMethod(field1588[5]);
               if (var1 != null) {
                  try {
                     Runtime var2 = Runtime.getRuntime();
                     Long var3 = (Long)var1.invoke(var2, (Object[])null);
                     class409.field5915 = 1 + (int)(var3 / 1048576L);
                  } catch (Throwable var5) {
                  }
               }
            } catch (Exception var6) {
            }
         }

         if (arg0 == -126) {
            ++field1579;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1588[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(IIB)Z",
      line = 62
   )
   public static final boolean method988(int arg0, int arg1, byte arg2) {
      try {
         ++field1578;
         if (arg2 != -1) {
            return false;
         } else {
            return (arg0 & 393216) != 0 | class366.method2729(-120, arg0, arg1) || class326.method2410(false, arg0, arg1) || class13.method75(arg0, 126, arg1);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1588[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "<init>",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V",
      line = 87
   )
   public class122(int arg0, String arg1, int arg2, String arg3, long arg4) {
      try {
         this.field1586 = arg3;
         this.field1583 = arg2;
         this.field1577 = arg4;
         this.field1584 = arg0;
         this.field1582 = arg1;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1588[1] + arg0 + ',' + (arg1 != null ? field1588[0] : field1588[2]) + ',' + arg2 + ',' + (arg3 != null ? field1588[0] : field1588[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method990(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method991(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
