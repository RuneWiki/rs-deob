import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qka")
public abstract class class184 implements class285 {
   @OriginalMember(
      owner = "client!qka",
      name = "p",
      descriptor = "I"
   )
   private int field2701 = -1;
   @OriginalMember(
      owner = "client!qka",
      name = "f",
      descriptor = "I"
   )
   private int field2700 = 0;
   @OriginalMember(
      owner = "client!qka",
      name = "i",
      descriptor = "I"
   )
   private int field2707;
   @OriginalMember(
      owner = "client!qka",
      name = "c",
      descriptor = "Z"
   )
   private boolean field2711;
   @OriginalMember(
      owner = "client!qka",
      name = "q",
      descriptor = "Lqs;"
   )
   public class771 field2702;
   @OriginalMember(
      owner = "client!qka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2714 = new String[]{method1665(method1664("54A\r")), method1665(method1664("**LO\u001fs")), method1665(method1664(" o\u0003O0")), method1665(method1664("**LO\u001cs")), method1665(method1664("\u001a\u0013j)l")), method1665(method1664("**LOq2/D\u0015ss")), method1665(method1664("**LO+2/L\r$!$\u0005")), method1665(method1664("**LO\bs")), method1665(method1664("**LO\u0000s")), method1665(method1664("**LO\u0002s")), method1665(method1664("**LO\fs")), method1665(method1664("**LO\u0001s")), method1665(method1664("**LO\u001ds")), method1665(method1664("**LO\u0007s")), method1665(method1664("**LO\u0003s"))};
   @OriginalMember(
      owner = "client!qka",
      name = "e",
      descriptor = "Lhha;"
   )
   public static class724 field2713;
   @OriginalMember(
      owner = "client!qka",
      name = "m",
      descriptor = "I"
   )
   private int field2694;
   @OriginalMember(
      owner = "client!qka",
      name = "t",
      descriptor = "I"
   )
   public static int field2695;
   @OriginalMember(
      owner = "client!qka",
      name = "k",
      descriptor = "I"
   )
   public static int field2696;
   @OriginalMember(
      owner = "client!qka",
      name = "g",
      descriptor = "I"
   )
   public static int field2698;
   @OriginalMember(
      owner = "client!qka",
      name = "r",
      descriptor = "I"
   )
   public static int field2699;
   @OriginalMember(
      owner = "client!qka",
      name = "j",
      descriptor = "I"
   )
   public static int field2703;
   @OriginalMember(
      owner = "client!qka",
      name = "a",
      descriptor = "I"
   )
   public static int field2704;
   @OriginalMember(
      owner = "client!qka",
      name = "o",
      descriptor = "I"
   )
   public static int field2705;
   @OriginalMember(
      owner = "client!qka",
      name = "n",
      descriptor = "I"
   )
   public static int field2706;
   @OriginalMember(
      owner = "client!qka",
      name = "h",
      descriptor = "I"
   )
   public static int field2708;
   @OriginalMember(
      owner = "client!qka",
      name = "s",
      descriptor = "I"
   )
   public static int field2709;
   @OriginalMember(
      owner = "client!qka",
      name = "b",
      descriptor = "I"
   )
   private int field2710;
   @OriginalMember(
      owner = "client!qka",
      name = "d",
      descriptor = "Lsa;"
   )
   public static class39 field2712;
   @OriginalMember(
      owner = "client!qka",
      name = "l",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field2697;

   @OriginalMember(
      owner = "client!qka",
      name = "c",
      descriptor = "(I)I"
   )
   public int method350(int arg0) {
      try {
         ++field2696;
         if (arg0 < 77) {
            this.method1659(-47, (MapBuffer)null, true);
         }

         return this.field2694;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2714[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "a",
      descriptor = "(Z)V"
   )
   public void method358(boolean arg0) {
      try {
         if (arg0) {
            if (~this.field2701 < -1) {
               this.field2702.method5551(this.field2694, 63, this.field2701);
               this.field2701 = -1;
            }

            ++field2703;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2714[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method1657(int arg0) {
      try {
         if (arg0 > 18) {
            field2712 = null;
            field2713 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2714[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method1658(byte arg0) {
      try {
         if (arg0 != -65) {
            this.method350(-118);
         }

         ++field2705;
         return ~this.field2701 == -1 ? this.field2697.getAddress() : 0L;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2714[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "a",
      descriptor = "(ILjaggl/MapBuffer;Z)Ljaclib/memory/Buffer;"
   )
   public final Buffer method1659(int arg0, MapBuffer arg1, boolean arg2) {
      try {
         if (arg0 >= -56) {
            return null;
         } else {
            ++field2704;
            if (~this.field2700 == -1) {
               this.method1663(0);
               if (this.field2701 <= 0) {
                  this.field2700 = 2;
                  return this.field2697;
               }

               OpenGL.glBindBufferARB(this.field2707, this.field2701);
               if (arg2) {
                  OpenGL.glBufferDataARBub(this.field2707, this.field2710, (byte[])null, 0, !this.field2711 ? 35044 : 35040);
                  if (~this.field2702.field3354.field5971 <= ~this.field2694) {
                     this.field2700 = 1;
                     return this.field2702.field3354;
                  }
               }

               if (!arg1.method5234() && arg1.method5235(this.field2707, this.field2694, 35001)) {
                  this.field2700 = 2;
                  return arg1;
               }
            }

            return null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2714[12] + arg0 + ',' + (arg1 != null ? field2714[2] : field2714[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "a",
      descriptor = "(Ljaggl/MapBuffer;I)Z"
   )
   public final boolean method1660(MapBuffer arg0, int arg1) {
      try {
         ++field2709;
         boolean var3 = true;
         if (this.field2700 != 0) {
            if (~this.field2701 < -1) {
               label39: {
                  OpenGL.glBindBufferARB(this.field2707, this.field2701);
                  if (~this.field2700 != -2) {
                     var3 = arg0.method5236();
                     if (!client.field10022) {
                        break label39;
                     }
                  }

                  OpenGL.glBufferSubDataARBa(this.field2707, 0, this.field2710, this.field2702.field3354.getAddress());
               }
            }

            this.field2700 = 0;
         }

         if (arg1 != 1) {
            this.field2711 = false;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2714[1] + (arg0 != null ? field2714[2] : field2714[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "a",
      descriptor = "(Ljaclib/memory/Source;II)Z"
   )
   public final boolean method1661(Source arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field2706;
         if (arg2 >= -72) {
            method1657(-127);
         }

         label51: {
            if (~this.field2710 > ~arg1) {
               this.method1663(0);
               if (this.field2701 <= 0) {
                  throw new RuntimeException(field2714[4]);
               }

               OpenGL.glBindBufferARB(this.field2707, this.field2701);
               OpenGL.glBufferDataARBa(this.field2707, arg1, arg0.getAddress(), !this.field2711 ? 35044 : 35040);
               this.field2702.field3391 += -this.field2694 + arg1;
               this.field2710 = arg1;
               if (!var4) {
                  break label51;
               }
            }

            if (~this.field2701 >= -1) {
               throw new RuntimeException(field2714[4]);
            }

            OpenGL.glBindBufferARB(this.field2707, this.field2701);
            OpenGL.glBufferSubDataARBa(this.field2707, 0, this.field2694, arg0.getAddress());
            this.field2702.field3391 += -this.field2694 + arg1;
            if (var4) {
               throw new RuntimeException(field2714[4]);
            }
         }

         this.field2694 = arg1;
         return true;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2714[3] + (arg0 != null ? field2714[2] : field2714[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "a",
      descriptor = "(IB)V"
   )
   public void method981(int arg0, byte arg1) {
      try {
         ++field2699;
         if (this.field2710 < arg0) {
            label35: {
               this.method1663(0);
               if (~this.field2701 >= -1) {
                  this.field2697 = this.field2702.method1996((byte)-19, arg0, false);
                  if (!client.field10022) {
                     break label35;
                  }
               }

               OpenGL.glBindBufferARB(this.field2707, this.field2701);
               OpenGL.glBufferDataARBub(this.field2707, arg0, (byte[])null, 0, !this.field2711 ? 35044 : 35040);
               this.field2702.field3391 += -this.field2710 + arg0;
            }

            this.field2710 = arg0;
         }

         if (arg1 <= 114) {
            this.method981(116, (byte)-87);
         }

         this.field2694 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2714[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1662(int arg0) {
      try {
         if (arg0 != 32073) {
            this.method1661((Source)null, -105, -96);
         }

         ++field2698;
         if (this.field2702.field11161) {
            OpenGL.glBindBufferARB(this.field2707, this.field2701);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2714[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.method358(true);
         ++field2695;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2714[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method1663(int arg0) {
      try {
         if (arg0 != 0) {
            field2712 = null;
         }

         ++field2708;
         if (~this.field2701 > -1) {
            if (!this.field2702.field11161) {
               this.field2701 = 0;
            } else {
               OpenGL.glGenBuffersARB(1, class247.field3779, 0);
               this.field2701 = class247.field3779[0];
               OpenGL.glBindBufferARB(this.field2707, this.field2701);
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2714[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qka",
      name = "<init>",
      descriptor = "(Lqs;IZ)V"
   )
   public class184(class771 arg0, int arg1, boolean arg2) {
      try {
         this.field2707 = arg1;
         this.field2711 = arg2;
         this.field2702 = arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2714[5] + (arg0 != null ? field2714[2] : field2714[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   static {
      new class198("", 73);
      field2713 = new class724(21, -1);
   }

   @OriginalMember(
      owner = "client!qka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1664(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1665(char[] arg0) {
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
            var10005 = 65;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
