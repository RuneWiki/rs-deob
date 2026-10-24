package deob;

@ObfuscatedName("VDSFJUIR")
public class VDSFJUIR {

	@ObfuscatedName("VDSFJUIR.g")
	public int field1411 = 0;

	@ObfuscatedName("VDSFJUIR.h")
	public int field1412 = 0;

	@ObfuscatedName("VDSFJUIR.i")
	public int field1413;

	@ObfuscatedName("VDSFJUIR.j")
	public int field1414;

	@ObfuscatedName("VDSFJUIR.k")
	public int[][] field1415;

	public VDSFJUIR(int arg0, int arg1) {
		field1413 = arg0;
		field1414 = arg1;
		field1415 = new int[field1413][field1414];
		method570();
	}

	@ObfuscatedName("VDSFJUIR.a()V")
	public void method570() {
		for (int var1 = 0; var1 < field1413; var1++) {
			for (int var2 = 0; var2 < field1414; var2++) {
				if (var1 == 0 || var2 == 0 || field1413 - 1 == var1 || field1414 - 1 == var2) {
					field1415[var1][var2] = 0xFFFFFF;
				} else {
					field1415[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("VDSFJUIR.a(IIIIZI)V")
	public void method571(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg1 -= field1411;
		arg4 -= field1412;
		if (arg0 == 0) {
			if (arg2 == 0) {
				method574(arg1, arg4, 128);
				method574(arg1 - 1, arg4, 8);
			}

			if (arg2 == 1) {
				method574(arg1, arg4, 2);
				method574(arg1, arg4 + 1, 32);
			}

			if (arg2 == 2) {
				method574(arg1, arg4, 8);
				method574(arg1 + 1, arg4, 128);
			}

			if (arg2 == 3) {
				method574(arg1, arg4, 32);
				method574(arg1, arg4 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				method574(arg1, arg4, 1);
				method574(arg1 - 1, arg4 + 1, 16);
			}

			if (arg2 == 1) {
				method574(arg1, arg4, 4);
				method574(arg1 + 1, arg4 + 1, 64);
			}

			if (arg2 == 2) {
				method574(arg1, arg4, 16);
				method574(arg1 + 1, arg4 - 1, 1);
			}

			if (arg2 == 3) {
				method574(arg1, arg4, 64);
				method574(arg1 - 1, arg4 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg2 == 0) {
				method574(arg1, arg4, 130);
				method574(arg1 - 1, arg4, 8);
				method574(arg1, arg4 + 1, 32);
			}

			if (arg2 == 1) {
				method574(arg1, arg4, 10);
				method574(arg1, arg4 + 1, 32);
				method574(arg1 + 1, arg4, 128);
			}

			if (arg2 == 2) {
				method574(arg1, arg4, 40);
				method574(arg1 + 1, arg4, 128);
				method574(arg1, arg4 - 1, 2);
			}

			if (arg2 == 3) {
				method574(arg1, arg4, 160);
				method574(arg1, arg4 - 1, 2);
				method574(arg1 - 1, arg4, 8);
			}
		}

		if (arg3) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					method574(arg1, arg4, 0x10000);
					method574(arg1 - 1, arg4, 4096);
				}

				if (arg2 == 1) {
					method574(arg1, arg4, 1024);
					method574(arg1, arg4 + 1, 16384);
				}

				if (arg2 == 2) {
					method574(arg1, arg4, 4096);
					method574(arg1 + 1, arg4, 0x10000);
				}

				if (arg2 == 3) {
					method574(arg1, arg4, 16384);
					method574(arg1, arg4 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					method574(arg1, arg4, 512);
					method574(arg1 - 1, arg4 + 1, 8192);
				}

				if (arg2 == 1) {
					method574(arg1, arg4, 2048);
					method574(arg1 + 1, arg4 + 1, 32768);
				}

				if (arg2 == 2) {
					method574(arg1, arg4, 8192);
					method574(arg1 + 1, arg4 - 1, 512);
				}

				if (arg2 == 3) {
					method574(arg1, arg4, 32768);
					method574(arg1 - 1, arg4 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg2 == 0) {
					method574(arg1, arg4, 66560);
					method574(arg1 - 1, arg4, 4096);
					method574(arg1, arg4 + 1, 16384);
				}

				if (arg2 == 1) {
					method574(arg1, arg4, 5120);
					method574(arg1, arg4 + 1, 16384);
					method574(arg1 + 1, arg4, 0x10000);
				}

				if (arg2 == 2) {
					method574(arg1, arg4, 20480);
					method574(arg1 + 1, arg4, 0x10000);
					method574(arg1, arg4 - 1, 1024);
				}

				if (arg2 == 3) {
					method574(arg1, arg4, 81920);
					method574(arg1, arg4 - 1, 1024);
					method574(arg1 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("VDSFJUIR.a(IIIZIII)V")
	public void method572(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg2 -= field1411;
		arg4 -= field1412;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg0;
			arg0 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg2; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field1413) {
				for (int var10 = arg4; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1414) {
						method574(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("VDSFJUIR.a(III)V")
	public void method573(int arg0, int arg1) {
		arg0 -= field1411;
		arg1 -= field1412;
		field1415[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("VDSFJUIR.b(III)V")
	public void method574(int arg0, int arg1, int arg2) {
		field1415[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("VDSFJUIR.a(IIIIIZ)V")
	public void method575(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg2 -= field1411;
		arg0 -= field1412;
		if (arg1 == 0) {
			if (arg3 == 0) {
				method577(128, arg0, arg2);
				method577(8, arg0, arg2 - 1);
			}

			if (arg3 == 1) {
				method577(2, arg0, arg2);
				method577(32, arg0 + 1, arg2);
			}

			if (arg3 == 2) {
				method577(8, arg0, arg2);
				method577(128, arg0, arg2 + 1);
			}

			if (arg3 == 3) {
				method577(32, arg0, arg2);
				method577(2, arg0 - 1, arg2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				method577(1, arg0, arg2);
				method577(16, arg0 + 1, arg2 - 1);
			}

			if (arg3 == 1) {
				method577(4, arg0, arg2);
				method577(64, arg0 + 1, arg2 + 1);
			}

			if (arg3 == 2) {
				method577(16, arg0, arg2);
				method577(1, arg0 - 1, arg2 + 1);
			}

			if (arg3 == 3) {
				method577(64, arg0, arg2);
				method577(4, arg0 - 1, arg2 - 1);
			}
		}

		if (arg1 == 2) {
			if (arg3 == 0) {
				method577(130, arg0, arg2);
				method577(8, arg0, arg2 - 1);
				method577(32, arg0 + 1, arg2);
			}

			if (arg3 == 1) {
				method577(10, arg0, arg2);
				method577(32, arg0 + 1, arg2);
				method577(128, arg0, arg2 + 1);
			}

			if (arg3 == 2) {
				method577(40, arg0, arg2);
				method577(128, arg0, arg2 + 1);
				method577(2, arg0 - 1, arg2);
			}

			if (arg3 == 3) {
				method577(160, arg0, arg2);
				method577(2, arg0 - 1, arg2);
				method577(8, arg0, arg2 - 1);
			}
		}

		if (arg4) {
			if (arg1 == 0) {
				if (arg3 == 0) {
					method577(0x10000, arg0, arg2);
					method577(4096, arg0, arg2 - 1);
				}

				if (arg3 == 1) {
					method577(1024, arg0, arg2);
					method577(16384, arg0 + 1, arg2);
				}

				if (arg3 == 2) {
					method577(4096, arg0, arg2);
					method577(0x10000, arg0, arg2 + 1);
				}

				if (arg3 == 3) {
					method577(16384, arg0, arg2);
					method577(1024, arg0 - 1, arg2);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg3 == 0) {
					method577(512, arg0, arg2);
					method577(8192, arg0 + 1, arg2 - 1);
				}

				if (arg3 == 1) {
					method577(2048, arg0, arg2);
					method577(32768, arg0 + 1, arg2 + 1);
				}

				if (arg3 == 2) {
					method577(8192, arg0, arg2);
					method577(512, arg0 - 1, arg2 + 1);
				}

				if (arg3 == 3) {
					method577(32768, arg0, arg2);
					method577(2048, arg0 - 1, arg2 - 1);
				}
			}

			if (arg1 == 2) {
				if (arg3 == 0) {
					method577(66560, arg0, arg2);
					method577(4096, arg0, arg2 - 1);
					method577(16384, arg0 + 1, arg2);
				}

				if (arg3 == 1) {
					method577(5120, arg0, arg2);
					method577(16384, arg0 + 1, arg2);
					method577(0x10000, arg0, arg2 + 1);
				}

				if (arg3 == 2) {
					method577(20480, arg0, arg2);
					method577(0x10000, arg0, arg2 + 1);
					method577(1024, arg0 - 1, arg2);
				}

				if (arg3 == 3) {
					method577(81920, arg0, arg2);
					method577(1024, arg0 - 1, arg2);
					method577(4096, arg0, arg2 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("VDSFJUIR.a(IIIIIZB)V")
	public void method576(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg1 -= field1411;
		arg4 -= field1412;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg2;
			arg2 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg2; var9++) {
			if (var9 >= 0 && var9 < field1413) {
				for (int var10 = arg4; var10 < arg0 + arg4; var10++) {
					if (var10 >= 0 && var10 < field1414) {
						method577(var7, var10, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("VDSFJUIR.a(IIII)V")
	public void method577(int arg0, int arg1, int arg2) {
		field1415[arg2][arg1] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("VDSFJUIR.a(IZI)V")
	public void method578(int arg0, int arg1) {
		arg1 -= field1411;
		arg0 -= field1412;
		field1415[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("VDSFJUIR.a(IIIIIZI)Z")
	public boolean method579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg3 && arg0 == arg4) {
			return true;
		}

		arg3 -= field1411;
		arg4 -= field1412;
		arg1 -= field1411;
		arg0 -= field1412;
		if (arg5 == 0) {
			if (arg2 == 0) {
				if (arg1 - 1 == arg3 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg4 && (field1415[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg4 && (field1415[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg1 == arg3 && arg0 + 1 == arg4) {
					return true;
				}

				if (arg1 - 1 == arg3 && arg0 == arg4 && (field1415[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg3 && arg0 == arg4 && (field1415[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg1 + 1 == arg3 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg4 && (field1415[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg4 && (field1415[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg1 == arg3 && arg0 - 1 == arg4) {
					return true;
				}

				if (arg1 - 1 == arg3 && arg0 == arg4 && (field1415[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg3 && arg0 == arg4 && (field1415[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg2 == 0) {
				if (arg1 - 1 == arg3 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg4) {
					return true;
				}

				if (arg1 + 1 == arg3 && arg0 == arg4 && (field1415[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg4 && (field1415[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg1 - 1 == arg3 && arg0 == arg4 && (field1415[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg4) {
					return true;
				}

				if (arg1 + 1 == arg3 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg4 && (field1415[arg3][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg1 - 1 == arg3 && arg0 == arg4 && (field1415[arg3][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg4 && (field1415[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg3 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg4) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg1 - 1 == arg3 && arg0 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg0 + 1 == arg4 && (field1415[arg3][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg3 && arg0 == arg4 && (field1415[arg3][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg0 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg1 == arg3 && arg0 + 1 == arg4 && (field1415[arg3][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg3 && arg0 - 1 == arg4 && (field1415[arg3][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg3 && arg0 == arg4 && (field1415[arg3][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg3 && arg0 == arg4 && (field1415[arg3][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("VDSFJUIR.a(IIIIIII)Z")
	public boolean method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg4 && arg0 == arg2) {
			return true;
		}

		arg1 -= field1411;
		arg2 -= field1412;
		arg4 -= field1411;
		arg0 -= field1412;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}

			if (arg5 == 0) {
				if (arg4 + 1 == arg1 && arg0 == arg2 && (field1415[arg1][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg0 - 1 == arg2 && (field1415[arg1][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg4 - 1 == arg1 && arg0 == arg2 && (field1415[arg1][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg0 - 1 == arg2 && (field1415[arg1][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg4 - 1 == arg1 && arg0 == arg2 && (field1415[arg1][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg0 + 1 == arg2 && (field1415[arg1][arg2] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg4 + 1 == arg1 && arg0 == arg2 && (field1415[arg1][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg0 + 1 == arg2 && (field1415[arg1][arg2] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg1 == arg4 && arg0 + 1 == arg2 && (field1415[arg1][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg4 && arg0 - 1 == arg2 && (field1415[arg1][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg1 && arg0 == arg2 && (field1415[arg1][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg1 && arg0 == arg2 && (field1415[arg1][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("VDSFJUIR.a(IIIIIIII)Z")
	public boolean method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg4 + arg5 - 1;
		int var9 = arg2 + arg6 - 1;
		if (arg3 >= arg4 && arg3 <= var8 && arg1 >= arg6 && arg1 <= var9) {
			return true;
		}

		if (arg4 - 1 == arg3 && arg1 >= arg6 && arg1 <= var9 && (field1415[arg3 - field1411][arg1 - field1412] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg1 >= arg6 && arg1 <= var9 && (field1415[arg3 - field1411][arg1 - field1412] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg1 && arg3 >= arg4 && arg3 <= var8 && (field1415[arg3 - field1411][arg1 - field1412] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg1 && arg3 >= arg4 && arg3 <= var8 && (field1415[arg3 - field1411][arg1 - field1412] & 0x20) == 0 && (arg0 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
