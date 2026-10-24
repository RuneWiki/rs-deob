package deob;

@ObfuscatedName("ONADPAJP")
public class ONADPAJP {

	@ObfuscatedName("ONADPAJP.h")
	public int field1088 = 0;

	@ObfuscatedName("ONADPAJP.i")
	public int field1089 = 0;

	@ObfuscatedName("ONADPAJP.j")
	public int field1090;

	@ObfuscatedName("ONADPAJP.k")
	public int field1091;

	@ObfuscatedName("ONADPAJP.l")
	public int[][] field1092;

	public ONADPAJP(int arg0, int arg1) {
		field1090 = arg0;
		field1091 = arg1;
		field1092 = new int[field1090][field1091];
		method451();
	}

	@ObfuscatedName("ONADPAJP.a()V")
	public void method451() {
		for (int var1 = 0; var1 < field1090; var1++) {
			for (int var2 = 0; var2 < field1091; var2++) {
				if (var1 == 0 || var2 == 0 || field1090 - 1 == var1 || field1091 - 1 == var2) {
					field1092[var1][var2] = 0xFFFFFF;
				} else {
					field1092[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("ONADPAJP.a(IZIIII)V")
	public void method452(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg0 -= field1088;
		arg2 -= field1089;
		if (arg4 == 0) {
			if (arg3 == 0) {
				method455(arg0, arg2, 128);
				method455(arg0 - 1, arg2, 8);
			}

			if (arg3 == 1) {
				method455(arg0, arg2, 2);
				method455(arg0, arg2 + 1, 32);
			}

			if (arg3 == 2) {
				method455(arg0, arg2, 8);
				method455(arg0 + 1, arg2, 128);
			}

			if (arg3 == 3) {
				method455(arg0, arg2, 32);
				method455(arg0, arg2 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				method455(arg0, arg2, 1);
				method455(arg0 - 1, arg2 + 1, 16);
			}

			if (arg3 == 1) {
				method455(arg0, arg2, 4);
				method455(arg0 + 1, arg2 + 1, 64);
			}

			if (arg3 == 2) {
				method455(arg0, arg2, 16);
				method455(arg0 + 1, arg2 - 1, 1);
			}

			if (arg3 == 3) {
				method455(arg0, arg2, 64);
				method455(arg0 - 1, arg2 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				method455(arg0, arg2, 130);
				method455(arg0 - 1, arg2, 8);
				method455(arg0, arg2 + 1, 32);
			}

			if (arg3 == 1) {
				method455(arg0, arg2, 10);
				method455(arg0, arg2 + 1, 32);
				method455(arg0 + 1, arg2, 128);
			}

			if (arg3 == 2) {
				method455(arg0, arg2, 40);
				method455(arg0 + 1, arg2, 128);
				method455(arg0, arg2 - 1, 2);
			}

			if (arg3 == 3) {
				method455(arg0, arg2, 160);
				method455(arg0, arg2 - 1, 2);
				method455(arg0 - 1, arg2, 8);
			}
		}

		if (arg1) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					method455(arg0, arg2, 0x10000);
					method455(arg0 - 1, arg2, 4096);
				}

				if (arg3 == 1) {
					method455(arg0, arg2, 1024);
					method455(arg0, arg2 + 1, 16384);
				}

				if (arg3 == 2) {
					method455(arg0, arg2, 4096);
					method455(arg0 + 1, arg2, 0x10000);
				}

				if (arg3 == 3) {
					method455(arg0, arg2, 16384);
					method455(arg0, arg2 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					method455(arg0, arg2, 512);
					method455(arg0 - 1, arg2 + 1, 8192);
				}

				if (arg3 == 1) {
					method455(arg0, arg2, 2048);
					method455(arg0 + 1, arg2 + 1, 32768);
				}

				if (arg3 == 2) {
					method455(arg0, arg2, 8192);
					method455(arg0 + 1, arg2 - 1, 512);
				}

				if (arg3 == 3) {
					method455(arg0, arg2, 32768);
					method455(arg0 - 1, arg2 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg3 == 0) {
					method455(arg0, arg2, 66560);
					method455(arg0 - 1, arg2, 4096);
					method455(arg0, arg2 + 1, 16384);
				}

				if (arg3 == 1) {
					method455(arg0, arg2, 5120);
					method455(arg0, arg2 + 1, 16384);
					method455(arg0 + 1, arg2, 0x10000);
				}

				if (arg3 == 2) {
					method455(arg0, arg2, 20480);
					method455(arg0 + 1, arg2, 0x10000);
					method455(arg0, arg2 - 1, 1024);
				}

				if (arg3 == 3) {
					method455(arg0, arg2, 81920);
					method455(arg0, arg2 - 1, 1024);
					method455(arg0 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ONADPAJP.a(IIZIIII)V")
	public void method453(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg3 -= field1088;
		arg4 -= field1089;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg0;
			arg0 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg3; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field1090) {
				for (int var10 = arg4; var10 < arg2 + arg4; var10++) {
					if (var10 >= 0 && var10 < field1091) {
						method455(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ONADPAJP.a(IBI)V")
	public void method454(int arg0, int arg1) {
		arg0 -= field1088;
		arg1 -= field1089;
		field1092[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("ONADPAJP.a(III)V")
	public void method455(int arg0, int arg1, int arg2) {
		field1092[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ONADPAJP.a(IIIIZZ)V")
	public void method456(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg2 -= field1088;
		arg3 -= field1089;
		if (arg1 == 0) {
			if (arg0 == 0) {
				method458(arg2, arg3, 128);
				method458(arg2 - 1, arg3, 8);
			}

			if (arg0 == 1) {
				method458(arg2, arg3, 2);
				method458(arg2, arg3 + 1, 32);
			}

			if (arg0 == 2) {
				method458(arg2, arg3, 8);
				method458(arg2 + 1, arg3, 128);
			}

			if (arg0 == 3) {
				method458(arg2, arg3, 32);
				method458(arg2, arg3 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				method458(arg2, arg3, 1);
				method458(arg2 - 1, arg3 + 1, 16);
			}

			if (arg0 == 1) {
				method458(arg2, arg3, 4);
				method458(arg2 + 1, arg3 + 1, 64);
			}

			if (arg0 == 2) {
				method458(arg2, arg3, 16);
				method458(arg2 + 1, arg3 - 1, 1);
			}

			if (arg0 == 3) {
				method458(arg2, arg3, 64);
				method458(arg2 - 1, arg3 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg0 == 0) {
				method458(arg2, arg3, 130);
				method458(arg2 - 1, arg3, 8);
				method458(arg2, arg3 + 1, 32);
			}

			if (arg0 == 1) {
				method458(arg2, arg3, 10);
				method458(arg2, arg3 + 1, 32);
				method458(arg2 + 1, arg3, 128);
			}

			if (arg0 == 2) {
				method458(arg2, arg3, 40);
				method458(arg2 + 1, arg3, 128);
				method458(arg2, arg3 - 1, 2);
			}

			if (arg0 == 3) {
				method458(arg2, arg3, 160);
				method458(arg2, arg3 - 1, 2);
				method458(arg2 - 1, arg3, 8);
			}
		}

		if (arg4) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					method458(arg2, arg3, 0x10000);
					method458(arg2 - 1, arg3, 4096);
				}

				if (arg0 == 1) {
					method458(arg2, arg3, 1024);
					method458(arg2, arg3 + 1, 16384);
				}

				if (arg0 == 2) {
					method458(arg2, arg3, 4096);
					method458(arg2 + 1, arg3, 0x10000);
				}

				if (arg0 == 3) {
					method458(arg2, arg3, 16384);
					method458(arg2, arg3 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					method458(arg2, arg3, 512);
					method458(arg2 - 1, arg3 + 1, 8192);
				}

				if (arg0 == 1) {
					method458(arg2, arg3, 2048);
					method458(arg2 + 1, arg3 + 1, 32768);
				}

				if (arg0 == 2) {
					method458(arg2, arg3, 8192);
					method458(arg2 + 1, arg3 - 1, 512);
				}

				if (arg0 == 3) {
					method458(arg2, arg3, 32768);
					method458(arg2 - 1, arg3 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg0 == 0) {
					method458(arg2, arg3, 66560);
					method458(arg2 - 1, arg3, 4096);
					method458(arg2, arg3 + 1, 16384);
				}

				if (arg0 == 1) {
					method458(arg2, arg3, 5120);
					method458(arg2, arg3 + 1, 16384);
					method458(arg2 + 1, arg3, 0x10000);
				}

				if (arg0 == 2) {
					method458(arg2, arg3, 20480);
					method458(arg2 + 1, arg3, 0x10000);
					method458(arg2, arg3 - 1, 1024);
				}

				if (arg0 == 3) {
					method458(arg2, arg3, 81920);
					method458(arg2, arg3 - 1, 1024);
					method458(arg2 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ONADPAJP.a(ZIIIIII)V")
	public void method457(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg4 -= field1088;
		arg1 -= field1089;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg2;
			arg2 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg4; var9 < arg2 + arg4; var9++) {
			if (var9 >= 0 && var9 < field1090) {
				for (int var10 = arg1; var10 < arg1 + arg3; var10++) {
					if (var10 >= 0 && var10 < field1091) {
						method458(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ONADPAJP.a(IIII)V")
	public void method458(int arg0, int arg1, int arg2) {
		field1092[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("ONADPAJP.b(III)V")
	public void method459(int arg0, int arg1) {
		arg1 -= field1088;
		arg0 -= field1089;
		field1092[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ONADPAJP.a(IIIIIII)Z")
	public boolean method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg1 == arg3) {
			return true;
		}

		arg0 -= field1088;
		arg1 -= field1089;
		arg4 -= field1088;
		arg3 -= field1089;
		if (arg5 == 0) {
			if (arg2 == 0) {
				if (arg4 - 1 == arg0 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1 && (field1092[arg0][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1 && (field1092[arg0][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg0 == arg4 && arg3 + 1 == arg1) {
					return true;
				}

				if (arg4 - 1 == arg0 && arg1 == arg3 && (field1092[arg0][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg1 == arg3 && (field1092[arg0][arg1] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 + 1 == arg0 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1 && (field1092[arg0][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1 && (field1092[arg0][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg0 == arg4 && arg3 - 1 == arg1) {
					return true;
				}

				if (arg4 - 1 == arg0 && arg1 == arg3 && (field1092[arg0][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg1 == arg3 && (field1092[arg0][arg1] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg2 == 0) {
				if (arg4 - 1 == arg0 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg1 == arg3 && (field1092[arg0][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1 && (field1092[arg0][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg4 - 1 == arg0 && arg1 == arg3 && (field1092[arg0][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1 && (field1092[arg0][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 - 1 == arg0 && arg1 == arg3 && (field1092[arg0][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1 && (field1092[arg0][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg4 - 1 == arg0 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg3 + 1 == arg1 && (field1092[arg0][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg1 == arg3 && (field1092[arg0][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg3 - 1 == arg1) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg0 == arg4 && arg3 + 1 == arg1 && (field1092[arg0][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg3 - 1 == arg1 && (field1092[arg0][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg0 && arg1 == arg3 && (field1092[arg0][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg0 && arg1 == arg3 && (field1092[arg0][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ONADPAJP.b(IIIIIII)Z")
	public boolean method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg3 && arg2 == arg5) {
			return true;
		}

		arg3 -= field1088;
		arg5 -= field1089;
		arg0 -= field1088;
		arg2 -= field1089;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg0 + 1 == arg3 && arg2 == arg5 && (field1092[arg3][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg2 - 1 == arg5 && (field1092[arg3][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg0 - 1 == arg3 && arg2 == arg5 && (field1092[arg3][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg2 - 1 == arg5 && (field1092[arg3][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg0 - 1 == arg3 && arg2 == arg5 && (field1092[arg3][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg2 + 1 == arg5 && (field1092[arg3][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg0 + 1 == arg3 && arg2 == arg5 && (field1092[arg3][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg2 + 1 == arg5 && (field1092[arg3][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg0 == arg3 && arg2 + 1 == arg5 && (field1092[arg3][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg3 && arg2 - 1 == arg5 && (field1092[arg3][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg3 && arg2 == arg5 && (field1092[arg3][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg3 && arg2 == arg5 && (field1092[arg3][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ONADPAJP.a(ZIIIIIII)Z")
	public boolean method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg5 + arg6 - 1;
		int var9 = arg1 + arg3 - 1;
		if (arg2 >= arg5 && arg2 <= var8 && arg4 >= arg1 && arg4 <= var9) {
			return true;
		}

		if (arg5 - 1 == arg2 && arg4 >= arg1 && arg4 <= var9 && (field1092[arg2 - field1088][arg4 - field1089] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg2 && arg4 >= arg1 && arg4 <= var9 && (field1092[arg2 - field1088][arg4 - field1089] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg4 && arg2 >= arg5 && arg2 <= var8 && (field1092[arg2 - field1088][arg4 - field1089] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg2 >= arg5 && arg2 <= var8 && (field1092[arg2 - field1088][arg4 - field1089] & 0x20) == 0 && (arg0 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
